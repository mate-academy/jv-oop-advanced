package core.basesyntax;

public class Square extends Figure {
    private double side = Math.random() * 10;

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, "
                + "side: %.1f units, "
                + "color: %s%n", name(), getArea(), side, color());
    }

    @Override
    public String name() {
        return "square";
    }

    @Override
    public String color() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return colorSupplier.getRandomColor();
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
