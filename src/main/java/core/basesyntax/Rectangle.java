package core.basesyntax;

public class Rectangle extends Figure implements DrawFigure {
    private double length = Math.random() * 10;
    private double width = Math.random() * 10;

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units,"
                + " length: %.1f units, secondLeg: %.1f "
                + "units, color: %s%n", name(), getArea(), length, width, color());
    }

    @Override
    public String name() {
        return "rectangle";
    }

    @Override
    public String color() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return colorSupplier.getRandomColor();
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
