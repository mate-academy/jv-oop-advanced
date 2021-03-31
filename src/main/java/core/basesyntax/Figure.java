package core.basesyntax;

public abstract class Figure implements DrawFigure, CalculateArea {
    private String figureName;
    private String figureColor;

    public Figure(String figureName, String figureColor) {
        this.figureName = figureName;
        this.figureColor = figureColor;
    }

    public String getFigureColor() {
        return figureColor;
    }

    public String getFigureName() {
        return figureName;
    }
}
