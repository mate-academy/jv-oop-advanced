package core.basesyntax;

public abstract class Figure implements Drawable, CalculateArea {
    private final Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
