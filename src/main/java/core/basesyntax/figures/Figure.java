package core.basesyntax.figures;

public abstract class Figure implements Drawable, AreaCalculator {
    protected String color;

    protected Figure(String color) {
        this.color = color;
    }
}
