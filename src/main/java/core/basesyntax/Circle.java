package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(Color color, int radius) {
        super(Shape.CIRCLE, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * this.radius * this.radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getShape() + ", area: " + getArea()
                + " sq.units, radius: " + radius + " sq.units, color: "
                + getColor().name().toLowerCase());
    }
}
