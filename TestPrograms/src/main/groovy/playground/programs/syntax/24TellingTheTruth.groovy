package playground.programs.syntax

/**
 * Groovy has a broader sense of what is true and what is false than just boolean expressions. For example, an empty
 * list or String value evaluates to false.
 */

// Booleans
def b1 = false
def b2 = true

assert !b1
assert b2

// Strings
def s1 = ''
def s2 = 'abc'
assert !s1
assert s2

// Numbers
def n1 = 0
def n2 = 42
assert !n1
assert n2

// List, iterators:
def l1 = []
def l2 = ['Abhay', 'Soham', 'Manik']
assert !l1
assert l2

def i1 = l1.iterator()
def i2 = l2.iterator()
assert !i1
assert i2

//  Maps
def m1 = [:]
def m2 = [name: 'Soham', age: 8]
assert !m1
assert m2

// Objects
def o1
def o2 = new Expando(name: 'groovy')
assert !o1
assert o2

// Matchers
def ma1 = 'groovy' =~ /java/
def ma2 = 'groovy' =~ /groovy/
assert !ma1
assert ma2

println "---- End of program ----"

