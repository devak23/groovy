package playground.programs.syntax.model._29

class Size {
    def x, y

    Object asType(Class clazz) {
        if (clazz == SquaredSize) {
            new SquaredSize(x: x**2, y: y**2)
        }
    }
}
