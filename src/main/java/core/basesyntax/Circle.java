package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + "circle," + " radius : " + getRadius() + " units,"
                + " color : " + getColor() + ", area : " + calculateArea() + " sq.units");
    }
}
