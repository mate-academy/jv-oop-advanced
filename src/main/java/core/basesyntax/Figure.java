package core.basesyntax;

public abstract class Figure implements Draw, AreaCalculator {
    private FigureType figureType;
    private Color color;

    public Figure(FigureType figureType, Color color) {
        this.figureType = figureType;
        this.color = color;
    }

    public FigureType getFigureType() {
        return figureType;
    }

    public Color getColor() {
        return color;
    }
}
