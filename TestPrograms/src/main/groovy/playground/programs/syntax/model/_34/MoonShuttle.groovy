package playground.programs.syntax.model._34

/**
 * You can implement multiple traits in one class
 */
class MoonShuttle extends Rocket implements MoonLander, Shuttle {
    @Override
    int getCargoBaySize() {
        100
    }
}
