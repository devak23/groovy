package playground.programs.syntax

import playground.model._09.User

/**
 * Groovy has a with() method we can use to group method calls and property access to an object. The with() accepts a
 * closure and every method call or property access in the closure applies to the object if applicable. The method is a
 * part of Groovy's extensions to the java.lang.Object class.
 */

def user = new User()

user.with {
    name = 'abhay'
    email = 'abhayk@yahoo.com'
    println introduce()
    addLabel 'Groovy'
    addLabel 'Java'
}

assert 2 == user.labels.size()
assert 'Groovy' == user.labels[0]
assert 'Java' == user.labels[1]
assert 'abhay' == user.name
assert 'abhayk@yahoo.com' == user.email

def sb = new StringBuilder()
sb.with {
    append 'Just another day,'
    append ' for you and me,'
    append ' in paradise.'
}

assert 'Just another day, for you and me, in paradise.' == sb.toString()

def cal = Calendar.instance
cal.with {
    clear()
    set(YEAR, 2021)
    set MONTH, JULY
    set DATE, 16
    add DATE, 2
}

assert 'July 18, 2021' == cal.time.format('MMMM d, yyyy')

println "---- End of program ----"
