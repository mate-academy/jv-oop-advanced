package core.basesyntax;

public class Circle extends Figure {
    private float radius;

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float)Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, radius: " + radius
                + " units, color: " + getColor());
    }
}
