package core.basesyntax;

public class Circle extends Figure {
    protected double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getParameters() {
        return "radius: " + String.format("%.2f", radius) + " units";
    }
}
