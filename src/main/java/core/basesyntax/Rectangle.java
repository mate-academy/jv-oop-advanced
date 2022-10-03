package core.basesyntax;

public class Rectangle extends Figure implements Area {
    private final double width;
    private final double height;
    ColorSupplier supplier = new ColorSupplier();

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + getArea() + " sq.units, width: " + width + " units, height: " + height
                + " units, color: " + color;
    }
}
