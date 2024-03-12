package core.basesyntax.model;

public class Circle extends Figure {
    private final double figureRadius;

    public Circle(double figureRadius, String color) {
        this.figureRadius = figureRadius;
        setColor(color);
    }

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
}
