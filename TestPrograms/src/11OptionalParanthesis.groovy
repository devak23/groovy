import model._09.User

/**
 * Groovy makes the code readable by small feature called optional parenthesis. If a method contains at least one
 * argument, we can leave out the parenthesis. This also works for methods with named parameters. We must be careful
 * to make sure there is no ambiguity before we leave out the parenthesis, else the results can be unexpected.
 */

def abhay = new User(name: 'Abhay')
def guru = new User(name: 'Guru')

// No Parenthesis needed
guru.meets abhay
abhay.meets guru

// Parenthesis are needed here else Groovy thinks greeting is a property
println guru.greeting()
// Output - Guru: hey mate!

// Named parameters
guru.says to: abhay, statement: "I am listening to Children - by Robert Miles"
// Output: Guru: 'I am listening to Children - by Robert Miles'

abhay.doSay abhay.name, 'Oh its a cool piece man!'
// Output: Abhay: 'Oh its a cool piece man!'


// Lookout with closures as the last element. The method can be invoked in several ways
def list = [1,2,3,4]

// Traditional - all parenthesis and comma
println list.sum(100, {it * 2})
// Output: 120

// Last argument is a closure, so can be outside the parenthesis and no comma
println  list.sum(100) {it * 2}
// Output: 120

// No parenthesis but with comma
newlist = list.sum 100, {it * 2}
println newlist
// Output: 120


println "---- End of program ----"