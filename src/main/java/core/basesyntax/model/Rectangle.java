package core.basesyntax.model;

public class Rectangle extends Figure {
    private static final String FIGURE_NAME = "Rectangle";
    private double figureWidth;
    private double figureHeight;

    @Override
    public double getArea() {
        return figureHeight * figureWidth;
    }

    @Override
    public void drawFigure() {
        System.out.format("Figure: %s, area: %.1f sq. units, "
                        + "width: %.1f sq. units, height: %.1f, color: %s \n",
                FIGURE_NAME, getArea(), figureWidth, figureHeight, getColor());
    }

    public void setFigureWidth(double figureWidth) {
        this.figureWidth = figureWidth;
    }

    public void setFigureHeight(double figureHeight) {
        this.figureHeight = figureHeight;
    }
}
