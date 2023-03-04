package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private final Color color;

    protected Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }
}
