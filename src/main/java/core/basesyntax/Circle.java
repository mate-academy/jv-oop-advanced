package core.basesyntax;

public class Circle extends Figure implements AreaCalculator, Drawable {
    final private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + Math.PI * radius * radius
                + ", radius: " + radius + " units, color: " + getColor());
    }
}
