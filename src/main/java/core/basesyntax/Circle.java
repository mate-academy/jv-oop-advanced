package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Figure: circle, area: " + getAreaCalculator() + " sq.units,"
                + " radius: " + radius + " units,"
                + " color: " + color);
    }

    @Override
    public double getAreaCalculator() {
        return Math.PI * radius * radius;
    }
}
