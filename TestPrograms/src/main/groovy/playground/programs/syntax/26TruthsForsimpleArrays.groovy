package playground.programs.syntax

/**
 * Arrays can also be used in conditional contexts. An empty array evaluates to false and filled one to true.
 */
def bytes = [] as byte []
def ints = [1,2,4] as int []
def floats = [1.0, 2.2] as float []
def booleans = [true ,false] as boolean []

assert !bytes
assert ints
assert floats
assert booleans

println "---- End of program ----"

