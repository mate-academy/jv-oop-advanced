package core.basesyntax;

public class Circle extends Figure {
    private static final double PI = 3.14;
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, color: " + getColor() + ", area: "
                + getArea() + " sq. units, radius: " + radius + " units");
    }
}
