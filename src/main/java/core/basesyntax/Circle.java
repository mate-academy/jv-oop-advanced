package core.basesyntax;

public class Circle extends Figure {
    private float radius;

    public Circle(float radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) Math.PI * radius * radius;
    }

    public String draw() {
        return "Figure: circle, area: " + getArea()
                + " sq.units, radius: " + radius + " units, color: "
                + getColor();
    }
}
