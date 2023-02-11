package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    public static final Color DEFAULT_COLOR = Color.WHITE;
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }
}
