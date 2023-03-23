package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, Color color) {
        this.type = getClass().getSimpleName();
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("Figure: " + type + ", area: " + getArea()
                + ", radius: " + radius + ", color: " + color);
    }
}
