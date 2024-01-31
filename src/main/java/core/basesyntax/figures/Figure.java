package core.basesyntax.figures;

public abstract class Figure implements AreaCalculator, Drawable {
    protected String color;

    protected Figure(String color) {
        this.color = color;
    }
}
