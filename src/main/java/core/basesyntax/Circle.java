package core.basesyntax;

public class Circle extends Figure {
    private float radius;

    public Circle(float radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float area() {
        return (float) Math.PI * radius * radius;
    }

    public String draw() {
        return "Figure: circle, area: " + area()
                + " sq.units, radius: " + radius + " units, color: "
                + getColor();
    }
}
