package core.basesyntax.figures;

public abstract class Figure implements Drawable {
    protected String color;

    protected Figure(String color) {
        this.color = color;
    }

    protected abstract double getArea();
}
