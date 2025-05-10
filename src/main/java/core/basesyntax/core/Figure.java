package core.basesyntax.core;

abstract class Figure implements Drawable, AreaCalculator {
    protected double radius;

    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
