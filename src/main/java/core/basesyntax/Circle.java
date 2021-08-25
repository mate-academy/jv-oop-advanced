package core.basesyntax;

public final class Circle extends Figure {
    private final float radius;

    public Circle(float radius, String color) {
        this.radius = radius;
        this.setColor(color);
    }

    @Override
    public float getArea() {
        return (float)Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: "
                + getArea()
                + " sq.units, radius: "
                + radius
                + " units, color: "
                + getColor());
    }
}
