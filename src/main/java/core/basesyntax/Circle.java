package core.basesyntax;

public class Circle extends Figure implements AreaCalculator {
    private double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: " + this.getClass().getSimpleName() + ", area: " + getArea()
            + " sq.units, radius: " + radius + " units, color: " + color;
    }
}
