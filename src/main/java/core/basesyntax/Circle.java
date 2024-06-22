package core.basesyntax;

public class Circle extends Figure {
    public static final String SHAPE_NAME = "circle";
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public void draw() {
        System.out.println("Figure: " + SHAPE_NAME + ", area: "
                + getArea() + " sq. units, radius: "
                + getRadius() + " units, color: " + getColor());
    }
}
