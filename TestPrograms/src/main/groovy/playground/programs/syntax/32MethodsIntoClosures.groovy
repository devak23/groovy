package playground.programs.syntax

import playground.programs.syntax.model._32.JavaObject

/**
 * A closure in Groovy is an anonymous block of code which takes in 0 or more parameters and always return a value.
 * Its an instance of the Closure class. A closure may access surrounding variables outside its scope and use them
 * along with its local variables during execution time. We can pass closures as method arguments to execute them. We
 * can also convert a method to a closure using the .& operator.Also we can use converted method just like a normal
 * closure. We can also use Java object method as a closure.
 */

// Simple list with names
def names = ["Abhay", "Soham", "Manik"]

// Simple closure
names.each { println "Normal closure says: Hello, $it !"}

// Groovy method to convert to closure
def groovySays (s) {
    println "Groovy says ~ Hello $s!"
}

// Use .& syntax to convert method into closure
names.each (this.&groovySays) // Notice how we don't use the closure syntax

// Convert Java method to closure and use it
def javaSays = JavaObject.&javaSays
names.each javaSays
println "---- End of program ----"

