import helpers.User

/**
 * We can use lists and maps to creat objects in Groovy. Groovy supports both implicit coersion (by type of the
 * parameter) and explicit coersion of a list to a constructor with as keyword.
 */

void assertValues(URL url) {
    assert 'http' == url.protocol
    assert 'www.yahoo.com' == url.host
    assert 80 == url.port
    assert '/' == url.file
    assert '/' == url.path
}

// Default constructor invocation
def url1 = new URL('http', 'www.yahoo.com', 80, '/')
assertValues(url1)

// Explicit coersion with as keyword
def url2 = ['http', 'www.yahoo.com', 80, '/'] as URL
assertValues(url2)

// Implicit coersion by the type of the variable
URL url3 = ['http', 'www.yahoo.com', 80, '/']
// note the return type of the list is not a def but a URL object. Try changing it to def and you run into an exception
// because if its a list, it has no properties like host, port, protocol, file and path
assertValues(url3)

// When we use Groovy Beans syntax, we can initialize the constructor using the named parameters apart from the
// explicit/implicit coersion
def u1 = new User([name: 'Abhay', age: 42])
assert u1.age == 42
assert u1.name == 'Abhay'

// Explicit coersion
def u2 = [age: 8, name: 'Soham'] as User
assert u2.age == 8
assert u2.name == "Soham"

// Implicit coersion
User u3 = [name: 'Manik', age: 42]
assert u3.name == 'Manik'
assert u3.age == 42


println "---- End of program ----"

