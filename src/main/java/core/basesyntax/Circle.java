package core.basesyntax;

public class Circle extends AbstractFigure {
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        System.out.println("Figure: circle, area: "
                + getArea() + " sq.units, radius: "
                + radius + " units, color: "
                + getColor());
        return null;
    }
}
