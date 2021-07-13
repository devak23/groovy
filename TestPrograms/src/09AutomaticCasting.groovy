/*
If Groovy knows the return type of a method, it will automatically cast our return value to that type.
This works for String ,boolean and Class
*/

String simple() {
    42
}

assert 'java.lang.String' == simple().class.name
assert '42' == simple()

class User {
    String name, email
}

User createUser(name, email) {
    [name: name, email: email]
}

abhay = createUser('abhay', 'abhayk@yahoo.com');
assert 'abhay' == abhay.name
assert 'abhayk@yahoo.com' == abhay.email

println "All good here."