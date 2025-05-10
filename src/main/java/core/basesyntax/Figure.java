package core.basesyntax;

abstract class Figure implements Drawable, AreaCalculable {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
