package core.basesyntax;

public class RightTriangle implements Figure {
    private double side;
    private ColorSupplier supplier = new ColorSupplier();

    public RightTriangle(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) / 4 * Math.pow(side, 2);
    }

    @Override
    public String getValue() {
        return String.valueOf(side);
    }

    @Override
    public String toString() {
        return "Figure: rightTriangle, area: " + getArea()
                + " sq.units, side: "
                + getValue() + " units, color: "
                + supplier.getRandomColor();
    }
}
