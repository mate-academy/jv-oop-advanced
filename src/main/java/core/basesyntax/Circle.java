package core.basesyntax;

public class Circle extends FigureSupplier implements Drawable, AreaCalculator {
    private final double radius;
    private ColorSupplier supplier = new ColorSupplier();

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String getValue() {
        return String.valueOf(radius);
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + getArea()
                + " sq.units, radius: "
                + getValue() + " units, color: "
                + supplier.getRandomColor();
    }
}
