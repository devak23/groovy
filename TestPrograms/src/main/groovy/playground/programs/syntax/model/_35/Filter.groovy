package playground.programs.syntax.model._35

/**
 *  A trait to remove the mr from the input
 */
trait Filter implements Transformer{
    @Override
    String transform(String input) {
        super.transform(input - 'mr')
    }
}