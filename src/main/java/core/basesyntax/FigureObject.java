package core.basesyntax;

public abstract class FigureObject implements Calculational, Drawable {
    private Color color;

    public FigureObject(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
