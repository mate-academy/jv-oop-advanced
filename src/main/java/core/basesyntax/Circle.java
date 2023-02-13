package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;

    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, "
                + "area: " + Math.floor(getArea()) + " sq.units, "
                + "radius: " + radius + " units"
                + ", color: " + color.toString().toLowerCase());
    }
}
