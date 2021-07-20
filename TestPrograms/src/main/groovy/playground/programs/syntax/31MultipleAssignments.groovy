package playground.programs.syntax

import playground.programs.syntax.model._31.Location

/**
 * You can define and assign values to several variables at once. This is especially useful when a method returns
 * multiple values and we want to assign them to separate variables.
 */

// Assign and declare
def (username, email) = ['abhay', 'abhayk@yahoo.com']
assert 'abhay' == username
assert 'abhayk@yahoo.com' == email

// We can assign later than the definition of the variables
int houseNumber
String streetName
(streetName, houseNumber) = ['Fremont Boulevard', 38675]

assert 38675 == houseNumber
assert 'Fremont Boulevard' == streetName

// A method returning multiple values
def whereAreYou() {
    [29.20091, 12.90391]
}

def (x,y) = whereAreYou()
assert 29.20091 == x
assert 12.90391 == y

// If there are more values provided than the number of variables, they are ignored.
def (a, b, c) = [0,1,1,2,3,5,8]
assert 0 == a
assert 1 == b
assert 1 == c

// If there are lesser values specified than the number of variables, the non matching variables values are not set
def (name, age, salary) = ['Abhay', 42]
assert 'Abhay' == name
assert 42 == age
assert !salary

// Multiple assignments for getting regular expression matching groups
def money = '12 Euro'
def regexp = /(\d+) (\w+)/

def (exp, amount, currency) = (money =~ regexp)[0]
assert '12' == amount
assert 'Euro' == currency

// Multi assignments work for typed variables and also for our own classes. We do however need to provide a getAt method

def (int myX, int myY ) = new Location (x:12, y:30)

assert 12 == myX
assert 30 == myY

println "---- End of program ----"

