package core.basesyntax;

public abstract class FigureColor implements Drawable, AreaCalculator {
    private Color color;

    public FigureColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
