package playground.programs.syntax

import playground.programs.syntax.model._09.User

/**
 * In groovy we can coerce objects to boolean. We only have to provide a method 'asBoolean()' and return a true/false.
 * This means our object can be used in a conditional context of any other methods or properties
 */

assert new User(name: 'abhay', active: true)
assert !new User(name: 'soham', active: false)


// We can also add the asBoolean via metaClass feature (to be explored later)
String.metaClass.asBoolean = {
    delegate == /anyString you want/
}

assert !'true'
assert 'anyString you want'
assert !'anyString I want'

println "---- End of program ----"

