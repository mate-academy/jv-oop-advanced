package core.basesyntax;

public abstract class Figure implements AreaCalculator, DrawingFigure {
    private Color color;

    Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
