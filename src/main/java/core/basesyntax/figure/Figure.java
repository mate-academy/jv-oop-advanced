package core.basesyntax.figure;

public abstract class Figure implements GetArea, Draw {
    private String figureColor;

    public void setFigureColor(String figureColor) {
        this.figureColor = figureColor;
    }

    public String getFigureColor() {
        return figureColor;
    }
}
