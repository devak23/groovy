package playground.programs.syntax

/**
 * Groovy's switch construct can contain different classifiers instead of just having an int or int-derived types.
 * Anything that implements isCase() method can be a classifier. Groovy added the isCase() method to the Class (uses
 * isInstance()), Object (uses equals()), collections (uses contains()) and regular expressions (uses matches()). This
 * means if we implement the isCase() in our Groovy classes, then they too can be used as a classifier as well. Finally
 * a closure evaluating to a boolean can also be used as a classifier
 */

def testSwitch(val) {
    def result
    switch (val) {
        case ~/^Switch.*Groovy$/:
            result = 'Pattern match'
            break
        case BigInteger:
            result = 'Class isInstance'
            break
        case 60..90:
            result = 'Range contains'
            break
        case [21, 'test', 9.12]:
            result = 'List contains'
            break
        case 42.056:
            result = 'Object equals'
            break
        case {it instanceof Integer && it < 50}:
            result = 'Closure boolean'
            break
        default:
            result = 'default'
    }
    result
}

assert 'Pattern match' == testSwitch('Switch to Groovy')
assert 'Class isInstance' == testSwitch(42G)
assert 'List contains' == testSwitch('test')
assert 'Object equals' == testSwitch(42.056)
assert 'Closure boolean' == testSwitch(20)
assert 'default' == testSwitch('none')

/**
 * A map can also be used as a case in the switch statement. Groovy tries to finds the switch operand in the map
 * elements by going over the keys and if found, returns true
 */

def mapSwitch(val) {
    def result
    switch (val) {
        case [groovy: 'Rocks!', version: 'any version!']:
            result = "Map contains key '$val'"
            break
        case 60..90:
            result = "Range contains $val"
            break
        case [21, 'test', 9.12]:
            result = "List contains '$val'"
            break
        default:
            result = 'default'
    }
    result
}

assert "Map contains key 'groovy'" == mapSwitch('groovy')
assert "Range contains 70" == mapSwitch(70)
assert "List contains 'test'" == mapSwitch('test')
assert "default" == mapSwitch('default')

println "---- End of program ----"
