package core.basesyntax;

public class Circle extends Figure {
    private final int radius;
    private double circleArea;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle; color: " + color
                + "; radius: " + radius
                + "; area: " + String.format("%.2f", getArea()));
    }
}
