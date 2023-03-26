package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + String.format("%.2f", getArea())
                + ", radius: " + radius + ", color: " + color);
    }
}
