package playground.programs.syntax.model._35

trait Upper implements Transformer {

    @Override
    String transform(String input) {
        super.transform (input.toUpperCase())
    }
}