package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String display() {
        return "Figure: circle, area " + String.format("%.2f", calculateArea()) + " sq. units, radius " + radius + " units, color: " + getColor();
    }
}
