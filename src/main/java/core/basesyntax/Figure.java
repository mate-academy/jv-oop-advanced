package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private final Color color;
    private final FigureType figureType;

    public Figure(Color color, FigureType figureType) {
        this.color = color;
        this.figureType = figureType;
    }

    public FigureType getFigureType() {
        return figureType;
    }

    public Color getColor() {
        return color;
    }
}
