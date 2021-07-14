/**
 * Default values ca be assigned to parameters in a method. Groovy supports two method signatures one with params
 * and one where the parameter with default value is omitted. If multiple default values are specified, the one on
 * the extreme right is eliminated and then next and so on.
 */


def say (msg = 'Hello', name = 'World!') {
    "$msg $name"
}

// We can invoke 3 signatures: say(), say(msg), say(msg, name)
assert "Hello World!" == say()

// Rightmost parameter with default value is eliminated first
assert 'Hi World!' == say('Hi')

assert 'Hi mate!' == say('Hi', 'mate!')

println "---- End of program ----"
