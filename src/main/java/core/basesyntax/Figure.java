package core.basesyntax;

public abstract class Figure implements Drawable {
    protected final Color color;

    protected Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract double getArea();
}
