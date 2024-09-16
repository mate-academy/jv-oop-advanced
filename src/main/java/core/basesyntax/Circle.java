package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        this.radius = radius;
        super.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return (Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: circle, area: " + area() + " sq. units"
                        + ", radius: " + radius + " units"
                        + ", color: " + color);
    }
}
