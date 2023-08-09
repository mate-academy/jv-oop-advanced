package core.basesyntax.figures;

public abstract class Figure implements Drawable, AreaCalculator {
    protected String color;

    Figure(String color) {
        this.color = color;
    }
}
