package core.basesyntax.model;

public class Rectangle extends Figure {
    private double figureWidth;
    private double figureHeight;

    @Override
    public double getArea() {
        return figureHeight * figureWidth;
    }

    @Override
    public void draw() {
        System.out.format("Figure: Rectangle, area: %.1f sq. units, "
                        + "width: %.1f sq. units, height: %.1f, color: %s \n",
                getArea(), figureWidth, figureHeight, getColor());
    }

    public void setFigureWidth(double figureWidth) {
        this.figureWidth = figureWidth;
    }

    public void setFigureHeight(double figureHeight) {
        this.figureHeight = figureHeight;
    }
}
