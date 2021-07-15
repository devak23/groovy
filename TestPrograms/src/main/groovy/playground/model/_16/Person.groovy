package playground.model._16

class Person {
    String name
    Address address
    String phoneNumber

    def moveTo(newAddress, newPhoneNumber) {
        address.street = newAddress.street
        address.number = newAddress['number'] as int //casting to int
        address.city = newAddress."city"
        phoneNumber = newPhoneNumber
    }
}
