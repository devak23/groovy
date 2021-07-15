package playground.programs

import playground.model._18.Dog
import playground.model._18.Elephant
import playground.model._18.TerrestrialAnimal
import playground.model._18.Tiger


/**
 * Multi method or multi dispatch is a mechanism where at runtime, correct method is chosen based on runtime type
 * of the arguments of the method.
 */

def getType(TerrestrialAnimal animal) { "getType (TerrestrialAnimal): $animal.type"}
def getType(Tiger animal) { "getType (Tiger): $animal.type"}
def getType(a) { "getType (a): $a.type" }


// Create new Animal types but use TerrestrialAnimal as type reference

TerrestrialAnimal elephant = new Elephant(type: "Elephant")
TerrestrialAnimal tiger = new Tiger(type: "Tiger")

assert "getType (TerrestrialAnimal): Elephant" == getType(elephant)

// This is NOT what Java would do!
assert "getType (Tiger): Tiger" == getType(tiger)

// Same as Java
assert "getType (TerrestrialAnimal): Tiger" == getType(tiger as TerrestrialAnimal)

// Create objects with type reference same as the object

Tiger tiger2 = new Tiger(type: 'tiger')
Elephant elephant2 = new Elephant(type: 'elephant')

assert "getType (TerrestrialAnimal): elephant" == getType(elephant2)
assert "getType (Tiger): tiger" == getType(tiger2)

assert "getType (a): labrador" == getType(new Dog(type: "labrador"))

println "---- End of program ----"
