package core.basesyntax;

public class Square extends FigureSupplier implements Drawable, AreaCalculator {
    private double side;
    private ColorSupplier supplier = new ColorSupplier();

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String getValue() {
        return String.valueOf(side);
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + getArea()
                + " sq.units, side: "
                + getValue() + " units, color: "
                + supplier.getRandomColor();
    }

}
