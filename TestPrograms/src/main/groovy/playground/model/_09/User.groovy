package playground.model._09

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode (includes = ["name"])
class User {
    String name, email
    Integer age
    List<User> connections = []

    void says(args) {
        connections.find {it.name == args.to.name}.doSay(name, args.statement)
    }

    void meets (user) {
        connections << user;
    }

    void doSay (speaker, words) {
        println "$speaker: '$words'"
    }

    String greeting() {
        "$name: hey mate!"
    }
}