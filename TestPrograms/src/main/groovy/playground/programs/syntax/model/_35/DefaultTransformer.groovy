package playground.programs.syntax.model._35

/**
 * A default trait will return the input values unchanged
 */
trait DefaultTransformer implements Transformer{
    @Override
    String transform(String input) {
        input
    }
}