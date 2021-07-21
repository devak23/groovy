package playground.programs.syntax.model._35

class StringTransformer implements DefaultTransformer, Upper, Filter {
    String value
    String getValue() {
        transform(value)
    }
}
