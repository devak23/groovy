package playground.programs.syntax.model._31

class Location {
    int x, y

    Object getAt(int index) {
        index == 0 ? x : y
    }
}
