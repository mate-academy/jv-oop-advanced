package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: circle, area: " + calculateArea()
                + ", radius: " + radius
                + ", color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
