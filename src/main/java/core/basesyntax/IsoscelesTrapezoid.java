package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height = Math.random() * 10;

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units,"
                + " height: %.1f units, "
                + "color: %s%n", name(), getArea(), height, color());
    }

    @Override
    public double getArea() {
        return height * height;
    }

    @Override
    public String color() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return colorSupplier.getRandomColor();
    }

    @Override
    public String name() {
        return "isosceles trapezoid";
    }
}
