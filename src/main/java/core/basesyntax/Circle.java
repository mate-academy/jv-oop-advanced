package core.basesyntax;
public class Circle extends Figure {
    private static final double PI = 3.14;
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + area() + " sq.units, radius: " + radius + " units, color: " + color.toLowerCase());
    }

    @Override
    public double area() {
        return PI*radius*radius;
    }
}
