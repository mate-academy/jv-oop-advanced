package core.basesyntax;

public abstract class Figure implements AreaCalculator, FigureDrawer {
    private Color figureColor;

    public void setFigureColor(Color figureColor) {
        this.figureColor = figureColor;
    }

    public Color getFigureColor() {
        return figureColor;
    }
}
