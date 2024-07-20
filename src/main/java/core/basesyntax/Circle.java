package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius * 100.0) / 100.0;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: circle, area: " + getArea() + ", radius: " + radius + ", color: " + color
        );
    }
}
