package core.basesyntax;

public abstract class Figure implements AreaCalculator, FigureDrawer {
    private String figureColor;

    public void setFigureColor(String figureColor) {
        this.figureColor = figureColor;
    }

    public String getFigureColor() {
        return figureColor;
    }
}
