package core.basesyntax;

public class Circle extends Figure {
    private static double PI = Math.PI;
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, "
                + "radius: " + radius + "units, "
                + "color:" + getColor());
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}
