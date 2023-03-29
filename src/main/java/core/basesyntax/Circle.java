package core.basesyntax;

public class Circle extends Figure implements Drawable {
    private double radius;
    private Color color;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + ", radius: " + radius + ", color: " + color.name());
    }
}
