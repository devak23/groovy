package model._19

import helpers._16.Person

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
