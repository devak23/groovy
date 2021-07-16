package playground.programs.syntax

/**
 * We can use the implies() method on boolean types. The implies() method implements logical implication. This means
 * if we have two Boolean variables A and B, that if A is true, then B is true. So if A is true then it is implied B
 * is true as well. If A is false then B can either be true or false. We could rewrite the implication as !A or B
 */

def a = true
def b = true

assert a.implies(b)
assert !(a.implies(false))

assert a.implies(b) == ((!a).or(b))

assert true.implies(true)
assert false.implies(true)
assert false.implies(false)
assert false.implies(!(true))
assert false.implies(false)
assert !true.implies(false)

println false.implies(true)

println "---- End of program ----"

