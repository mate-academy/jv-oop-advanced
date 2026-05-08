package core.basesyntax;

public abstract class Figure {
    // color is String, as described in the README document
    private String color;
    private FigureType figureType;

    public Figure(String color, FigureType figureType) {
        this.color = color;
        this.figureType = figureType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public FigureType getFigureType() {
        return figureType;
    }

    public void setFigureType(FigureType figureType) {
        this.figureType = figureType;
    }

    public abstract Double getArea();
}
