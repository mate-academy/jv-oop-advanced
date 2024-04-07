package core.basesyntax;

public abstract class Figure implements Obtainable, Drawable {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
