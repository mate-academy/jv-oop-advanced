package core.basesyntax;

public class Circle extends Figure {
    private float radius = 1;

    public Circle() {
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float area() {
        return (float) Math.PI * radius * radius;
    }

    public String toString() {
        return "Figure: circle, area: " + area()
                + " sq.units, radius: " + radius + " units, color: "
                + getColor();
    }
}
