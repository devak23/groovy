package playground.model._19

import playground.model._16.Person


/**
 * leftShift() is the method that gets called when you invoke the << operator. Here we overload it such that it returns
 * the 'this' Event instance when invoked
 */
class Event {
    List<Person> attendees = []
    List<Session> sessions = []

    Event leftShift (final Person person) {
        attendees << person
        this
    }

    Event leftShift (final Session session) {
        sessions << session
        this
    }
}
