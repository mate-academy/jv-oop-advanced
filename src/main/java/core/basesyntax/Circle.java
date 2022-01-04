package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.ceil(Math.PI * radius * radius * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: circle"
                + ", area: " + calculateArea()
                + " sq.units, radius: " + radius
                + " units, color: " + getColor());
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
