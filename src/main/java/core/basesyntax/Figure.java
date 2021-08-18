package core.basesyntax;

public abstract class Figure implements AreaCalculator, FigureDrawer {
    private Colors figureColor;

    public void setFigureColor(Colors figureColor) {
        this.figureColor = figureColor;
    }

    public Colors getFigureColor() {
        return figureColor;
    }
}
