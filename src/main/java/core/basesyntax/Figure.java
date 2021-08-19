package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    protected final String color;

    Figure(String color) {
        this.color = color;
    }
}
