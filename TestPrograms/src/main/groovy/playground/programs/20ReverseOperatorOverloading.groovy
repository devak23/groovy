package playground.programs

/**
 * One of the nice features of Groovy is operator overloading. Operator overloading also means the operators we know
 * in Java have corresponding methods which are not available in Java. So instead of operators, we can use the
 * corresponding methods in our code
 */

def a = true
def b = false

assert a | b
// Java boolean has no "or" method
assert a.or(b)

assert !(a & b)
assert !(a.and(b))

def x = 100
def y = 10

assert x + y == 110
// Java has no plus method
assert x.plus(y) == 110
// OR
assert x.plus(y).equals(110)

assert ++x == 101
// ++ maps to next() method
assert x.next() == 102

assert --y == 9
assert y.previous() == 8

println "---- End of program ----"
