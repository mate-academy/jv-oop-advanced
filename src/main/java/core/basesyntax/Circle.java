package core.basesyntax;

public class Circle extends Figure {
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
    public void printInfo() {
        System.out.println("Figure: Circle "
                + ", area: " + getArea() + ", radius: "
                + radius + ", color: " + getColor());
    }
}
