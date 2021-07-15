package playground.programs

import playground.model._16.Person
import playground.model._19.Event
import playground.model._19.Session


/**
 * An example of operator overloading. << operator was overloaded in the Event class and is used like a chain to add
 * Session and Person to the Event class.
 */

final Event gr8Conference = new Event()
gr8Conference
        << new Person(name: 'Abhay')
        << new Session(title: /Groovy's hidden Gems/)

assert 1 == gr8Conference.attendees.size()
assert 1 == gr8Conference.sessions.size()

assert 'Abhay' == gr8Conference.attendees[0].name
assert "Groovy's hidden Gems" == gr8Conference.sessions[0].title

println "---- End of program ----"
