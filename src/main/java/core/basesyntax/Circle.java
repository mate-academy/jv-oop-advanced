package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        setColor(color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + calculateArea()
                + " sq.units, radius: " + radius
                + " units, color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return Math.PI * (Math.pow(radius, 2));
    }
}
