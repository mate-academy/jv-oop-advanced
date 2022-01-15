package core.basesyntax;

public abstract class Figure implements AreaCalculator, FigureInfo {
    private Color color;

    Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
