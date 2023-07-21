package core.basesyntax;

public abstract class Figure implements AreaCalculable, Drawable {
    public static final Color DEFAULT_COLOR = Color.WHITE;

    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }
}
