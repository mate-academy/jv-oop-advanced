package core.basesyntax;

public class Circle extends Figure{
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getUniqueProperties() {
        return "radius: " + radius + " units";
    }
}
