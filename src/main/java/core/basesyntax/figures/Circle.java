package core.basesyntax.figures;

public class Circle extends Figure {

    private double radius;
    private static final double PI = 3.14;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public void draw() {
        String sb = "Figure: Circle," +
                " Color: " + getColor() +
                ", Radius: " + getRadius() +
                ", Area: " + getArea();

        System.out.println(sb);
    }
}
