package core.basesyntax;

public abstract class Figure implements Drawable, AreaCounter {
    private final Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract double countArea();

    public abstract void draw();
}
