package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + " area: " + calculateArea()
                + " sq. units, radius: " + radius + " units, color: " + getColor());
    }
}
