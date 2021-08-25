package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private String name = "Circle";

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        String circleInfo = "Figure "
                + name
                + ", area: "
                + getArea()
                + " sq.units, radius "
                + radius
                + " units, color: "
                + getColor();
        System.out.println(circleInfo);
    }
}
