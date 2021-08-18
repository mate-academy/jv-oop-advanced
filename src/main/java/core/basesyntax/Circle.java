package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        super();
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square,"
                + " area: " + getArea() + " sq.units"
                + ", radius: " + this.radius
                + ", color: " + this.color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
