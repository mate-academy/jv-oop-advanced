package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    protected Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
