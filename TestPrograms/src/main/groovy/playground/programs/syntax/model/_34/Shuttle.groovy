package playground.programs.syntax.model._34

trait Shuttle {
    boolean canFly() { true }
    abstract int getCargoBaySize()
    abstract String getName()
    String activateLandingGear() { "${getName()} landing gear activated."}
}