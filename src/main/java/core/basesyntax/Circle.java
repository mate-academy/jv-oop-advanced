package core.basesyntax;

public class Circle extends Figure {
    private double radius = Math.random() * 10;

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units,"
                + " radius: %.1f units, diagonal: %.1f units, "
                + "color: %s%n", name(), getArea(), radius, radius * 2, color());
    }

    @Override
    public String name() {
        return "circle";
    }

    @Override
    public String color() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return colorSupplier.getRandomColor();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
