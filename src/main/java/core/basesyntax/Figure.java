package core.basesyntax;

public abstract class Figure implements Drawable {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    protected abstract double getArea();
}
