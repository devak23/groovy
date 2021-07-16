package playground.programs.syntax

import java.text.MessageFormat as mf // Alias mf to MessageFormat

/**
 *
 *  We can change the type of an object with the 'as keyword'. We can make maps and closures look like interface
 *  implementations. We can use as in the imports to create an alias.
 */

// Usage of an alias
assert 'Simple message!' == mf.format('Simple {0}!', ['message'] as Object[])

// Normal groovy list
def intList = [1,2,3,4]
assert 'java.util.ArrayList' == intList.class.name
assert 4 == intList.size()

// Coerce to int[]
def intArray = intList as int[]
assert 'java.util.ArrayList' != intArray.class.name
assert 4 == intArray.length // Using int[] property - length

// Use 'as' to create Date object from list
def date = [121, 6, 16] as Date
println date
assert 2021 == date[Calendar.YEAR] // the year integer in the list is found by subtracting 1900 from the year you want
assert 6 == date[Calendar.MONTH]
assert 16 == date[Calendar.DATE]

// Use 'as' to treat closure as implementation for the Runnable interface
def t1 = new Thread({println 'hello there!'}  as Runnable)
t1.start()

// use 'as' to treat map as implementation for the Runnable interface
def t2 = new Thread([run: {println 'hi there!'}] as Runnable)
t2.start()


println "---- End of program ----"