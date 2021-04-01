package core.basesyntax;

public abstract class Figure extends ColorSupplier implements Drawable, AreaCalculator {
    protected String color;
    protected String name;

    Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
