package core.basesyntax.model;

public abstract class Figure implements AreaCalculating, Drawing {
    private String figureColor;

    public Figure(String figureColor) {
        this.figureColor = figureColor;
    }

    public String getFigureColor() {
        return figureColor;
    }

    public void setFigureColor(String figureColor) {
        this.figureColor = figureColor;
    }
}
