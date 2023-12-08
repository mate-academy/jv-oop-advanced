package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public abstract class Figure implements AreaCalculator, Drawable {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
