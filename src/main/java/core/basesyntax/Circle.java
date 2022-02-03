package core.basesyntax;

public class Circle extends Figure implements AreaCalculator {
    private int radius;

    public Circle(String color, int radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("The parameter values must be positive");
        }
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, radius: " + radius
                + " units, color: " + color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
