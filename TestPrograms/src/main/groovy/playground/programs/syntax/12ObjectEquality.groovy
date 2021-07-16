package playground.programs.syntax


import playground.model._09.User

/**
 * Groovy overloads the == operator and maps it to the equals() method or the compareTo() method method on objects that
 * implements the Comparator interface. The ! operator similarly checks if the objects are NOT same. In Java, the ==
 * operator checks if the variables are referring to the same object instance. To do that, Groovy provides the is()
 * method.
 * All null checks are automatically handled and no code is required to specifically check for nulls.
 */

Integer myAge = 42
Integer myAgeCopy = myAge
Integer wifesAge = 42
Integer sonsAge = 8


// Java: myAge.equals(myAgeCopy)
assert myAge == myAgeCopy
// Java: myAge == myAgeCopy
assert myAge.is(myAgeCopy)
assert myAge == wifesAge
assert myAge != sonsAge

abhay = new User(name: 'Abhay')
cloneOfAbhay = new User(name: 'Abhay')
assert abhay == cloneOfAbhay



def garbagePointer = null
assert null != cloneOfAbhay
assert abhay != garbagePointer

println "---- End of program ----"