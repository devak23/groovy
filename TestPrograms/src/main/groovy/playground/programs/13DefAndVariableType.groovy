package playground.programs

import org.codehaus.groovy.runtime.typehandling.GroovyCastException

/**
 * Groovy has a def keyword when you dont want to define a type of a variable. But at runtime, the variable will always
 * have a type
 */

def age = 42
assert age instanceof Integer

age = 'forty-two' // string assignment now changes the type
assert age instanceof String

String name = "Abhay"
assert name instanceof String

name = new Integer(100)
assert name instanceof String // Surprise!, the value is converted into String

int magicNumber = 42
assert magicNumber instanceof Integer

try {
    magicNumber = 'not a magic number' // cannot assign a String to an int variable
} catch (e) {
    assert e instanceof GroovyCastException
}

println "---- End of program ----"