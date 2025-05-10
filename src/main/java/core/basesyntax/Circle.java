package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(ColorSupplier.Color.valueOf(color));
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + getArea() + " sq. units, "
                + "radius: " + getRadius() + " units, "
                + "color: " + getColor());
    }

    public int getRadius() {
        return radius;
    }
}
