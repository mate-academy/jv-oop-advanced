package core.basesyntax.model;

public class Circle extends Figure {
    private int radius;

    public Circle() {
    }

    public Circle(Color color) {
        super(color);
    }

    public Circle(Color color, int radius) {
        this(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + calculateArea() + " sq.units, radius = "
                + getRadius() + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
