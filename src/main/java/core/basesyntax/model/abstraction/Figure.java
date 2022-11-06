package core.basesyntax.model.abstraction;

public abstract class Figure implements AreaCalculator, DrawFigure {
    private Color color;

    public Figure() {
    }

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
