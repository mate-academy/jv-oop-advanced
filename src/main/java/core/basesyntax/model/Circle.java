package core.basesyntax.model;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return Math.round(area * 10.0) / 10.0;
    }

    @Override
    public void draw() {
        System.out.println(super.getClass().getSuperclass().getName()
                + ": circle, "
                + "area: " + getArea() + " sq.units, "
                + "radius: " + radius + " units"
                + ", color: " + getColor());
    }
}
