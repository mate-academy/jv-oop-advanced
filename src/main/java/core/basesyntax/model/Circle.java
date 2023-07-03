package core.basesyntax.model;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * radius * radius;
        return Math.round(area * 10.0) / 10.0;
    }

    @Override
    public void draw() {
        System.out.println(super.getClass().getSuperclass().getName()
                + ": circle, "
                + "area: " + calculateArea() + " sq.units, "
                + "radius: " + radius + " units"
                + ", color: " + getColor());
    }
}
