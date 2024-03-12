package core.basesyntax.model;

public class Circle extends Figure {
    private static final String FIGURE_NAME = "Circle";
    private double figureRadius;

    @Override
    public double getArea() {
        return figureRadius * figureRadius * Math.PI;
    }

    @Override
    public void drawFigure() {
        System.out.format("Figure: %s, area: %.1f sq. units, radius: %.1f sq. units, color: %s \n",
                FIGURE_NAME, getArea(),figureRadius, getColor());

    }

    public void setFigureRadius(double figureRadius) {
        this.figureRadius = figureRadius;
    }
}
