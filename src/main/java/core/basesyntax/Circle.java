package core.basesyntax;

public class Circle extends AbstractFigure {
    private final double radius;

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, square: "
                + getArea() + " sq. m., radius: "
                + radius + " unit, color: "
                + color);
    }
}
