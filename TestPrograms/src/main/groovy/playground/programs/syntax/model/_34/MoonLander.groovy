package playground.programs.syntax.model._34

trait MoonLander {
    def land() {
        "${getName()} has landed!"
    }
    String activateLandingGear() { "${getName()} landing gear activated."}
    abstract String getName()
}