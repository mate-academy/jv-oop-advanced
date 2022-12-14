package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public abstract class Figure implements Drawable, GetArea {
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
