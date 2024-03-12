package core.basesyntax.model;

public class Circle extends Figure {
    private double figureRadius;

    @Override
    public double getArea() {
        return figureRadius * figureRadius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.format("Figure: Circle, area: %.1f sq. units, "
                        + "radius: %.1f sq. units,color: %s \n",
                getArea(),figureRadius, getColor());

    }

    public void setFigureRadius(double figureRadius) {
        this.figureRadius = figureRadius;
    }
}
