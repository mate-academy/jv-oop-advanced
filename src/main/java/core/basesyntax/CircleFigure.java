package core.basesyntax;

public class CircleFigure extends AbstractFigure {
    private final double radius;

    public CircleFigure(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %s sq. units, radius: %s units, color: %s%n",
                getArea(),
                radius,
                getColor());
    }
}
