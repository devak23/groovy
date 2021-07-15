import helpers.Dog
import helpers.Elephant
import helpers.TerristrialAnimal
import helpers.Tiger

/**
 * Multi method or multi dispatch is a mechanism where at runtime, correct method is chosen based on runtime type
 * of the arguments of the method.
 */

def getType(TerristrialAnimal animal) { "getType (TerristrialAnimal): $animal.type"}
def getType(Tiger animal) { "getType (Tiger): $animal.type"}
def getType(a) { "getType (a): $a.type" }


// Create new Animal types but use TerristrialAnimal as type reference

TerristrialAnimal elephant = new Elephant(type: "Elephant")
TerristrialAnimal tiger = new Tiger(type: "Tiger")

assert "getType (TerristrialAnimal): Elephant" == getType(elephant)

// This is NOT what Java would do!
assert "getType (Tiger): Tiger" == getType(tiger)

// Same as Java
assert "getType (TerristrialAnimal): Tiger" == getType(tiger as TerristrialAnimal)

// Create objects with type reference same as the object

Tiger tiger2 = new Tiger(type: 'tiger')
Elephant elephant2 = new Elephant(type: 'elephant')

assert "getType (TerristrialAnimal): elephant" == getType(elephant2)
assert "getType (Tiger): tiger" == getType(tiger2)

assert "getType (a): labrador" == getType(new Dog(type: "labrador"))

println "---- End of program ----"
