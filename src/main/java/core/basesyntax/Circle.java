package core.basesyntax;

public class Circle extends FigureBase {
    private final double radius;

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
        System.out.println("Circle [color=" + color + ", radius=" + radius + "]");
    }
}
