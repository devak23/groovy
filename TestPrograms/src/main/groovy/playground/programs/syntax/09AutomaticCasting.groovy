package playground.programs.syntax

import playground.model._09.User


/*
If Groovy knows the return type of a method, it will automatically cast our return value to that type.
This works for String ,boolean and Class
*/

String magicNumber() {
    42
}

assert 'java.lang.String' == magicNumber().class.name
assert '42' == magicNumber()

// User class is defined in the helper package.
User createUser(name, email) {
    [name: name, email: email]
}

abhay = createUser('abhay', 'abhayk@yahoo.com');
assert 'abhay' == abhay.name
assert 'abhayk@yahoo.com' == abhay.email

println "---- End of program ----"