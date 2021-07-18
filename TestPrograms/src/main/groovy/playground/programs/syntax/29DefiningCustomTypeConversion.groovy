package playground.programs.syntax

import playground.programs.syntax.model._29.Size
import playground.programs.syntax.model._29.SquaredSize

/**
 * We can override the method asType() to convert an object into another type. We can use the method asType() in our
 * code to invoke the conversion, but that can be made even shorter with 'as'
 */

def size = new Size(x:10, y: 15)
def squared = size as SquaredSize // Or size.asType(SquaredSize)

println squared

assert 100 == squared.x
assert 225 == squared.y

println "---- End of program ----"

