package playground.programs.syntax

import playground.programs.syntax.model._34.Apollo
import playground.programs.syntax.model._34.MoonShuttle

/**
 * Traits are like interfaces in Java with default implementations and state. The important distinction between Java
 * and Groovy is that groovy traits contain state (fields) as well. This allows more flexibility, but must be treated
 * with caution
 */

def apollo = new Apollo(name: "Apollo 11")
assert "Apollo 11 Take off!" == apollo.launch()
assert "Apollo 11 has landed!" == apollo.land()

/**
 * You can use multiple traits in one class
 */
MoonShuttle taxi = new MoonShuttle(name: "Taxi")
assert taxi.canFly()
assert 100 == taxi.getCargoBaySize()
assert "Taxi Take off!" == taxi.launch()
assert "Taxi has landed!" == taxi.land()
assert "Taxi landing gear activated." == taxi.activateLandingGear()

println "---- End of program ----"