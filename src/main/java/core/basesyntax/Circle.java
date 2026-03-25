package core.basesyntax;

public class Circle extends AbstractFigure {
    private final double radius;

    public Circle(String randomColor, double radius) {
        super(randomColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, radius: "
                + radius + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
