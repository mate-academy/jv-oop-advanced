package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (radius * radius) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: "
                + String.format("%.2f", calculateArea())
                + " sq. units, radius: "
                + String.format("%.0f", radius)
                + " units, color: "
                + getColor());
    }
}
