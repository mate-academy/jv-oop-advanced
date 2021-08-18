package core.basesyntax;

public abstract class Figures implements SquareOfFigure, PictureOfFigure {
    private String color;
    private String figureType;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return figureType;
    }

    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }
}
