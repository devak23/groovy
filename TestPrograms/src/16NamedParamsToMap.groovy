import helpers.Address
import helpers.Person

/**
 * When a method is invoked using named parameters, Groovy collects all named parameters and puts them into a map. The
 * Map is passed on to the method as the first argument. The method needs to know how to get the information from the
 * map and process it. There is one rule: first param must be a Map because Groovy will put that as the 1st argument
 * to the method. Other parameters are appended in the same order as defined in the method invocation.
 */

def fremont = new Address(street: 'Fremont Blvd', number: 38675, city: 'Fremont')
def person = new Person(name: 'abhay', address: fremont, phoneNumber: '312-954-1111')

// here we are messing up the order of parameters
person.moveTo(street: 'Lexington Ave', city: 'Fremont', '312-954-1101', number: 3355)
// Groovy transforms the method invocation to:
// abhay.moveTo([street: 'Lexington Ave', 3355, city: 'Fremont'],  '312-954-1101')


assert 'Lexington Ave' == person.address.street
assert 3355 == person.address.number
assert 'Fremont' == person.address.city
assert '312-954-1101' == person.phoneNumber
assert 'abhay' == person.name

println "---- End of program ----"

