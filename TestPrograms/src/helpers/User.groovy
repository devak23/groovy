package helpers

class User {
    String name, email
    def connections = []

    def says(args) {
        connections.find {it.name == args.to.name}.doSay(name, args.statement)
    }

    def meets (user) {
        connections << user;
    }

    def doSay (speaker, words) {
        println "$speaker: '$words'"
    }

    def greeting() {
        "$name: hey mate!"
    }
}