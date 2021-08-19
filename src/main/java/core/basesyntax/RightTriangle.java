package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg = Math.random() * 10;
    private double secondLeg = Math.random() * 10;

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, "
                + "length: %.1f units, secondLeg: %.1f units, "
                + "color: %s%n", name(), getArea(), firstLeg, secondLeg, color());
    }

    @Override
    public String name() {
        return "right triangle";
    }

    @Override
    public String color() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return colorSupplier.getRandomColor();
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
