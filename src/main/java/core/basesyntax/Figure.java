package core.basesyntax;

public abstract class Figure implements Drawable, CountArea {
    private final Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract void draw();
}
