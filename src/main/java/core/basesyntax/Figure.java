package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private final String color;
    private final FigureType figureType;

    public Figure(String color, FigureType figureType) {
        this.color = color;
        this.figureType = figureType;
    }

    public FigureType getFigureType() {
        return figureType;
    }

    public String getColor() {
        return color;
    }
}
