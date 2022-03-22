package core.basesyntax;

public class Rectangle implements Figure {
    private int width;
    private int height;
    private ColorSupplier supplier = new ColorSupplier();

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getValue() {
        return width + " units, height: " + height;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + getArea()
                + " sq.units, width: "
                + getValue() + " units, color: "
                + supplier.getRandomColor();
    }
}
