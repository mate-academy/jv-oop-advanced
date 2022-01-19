package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements FigureProperties {
    private double base;
    private double top;
    private double height;
    ColorSupplier colorSupplier = new ColorSupplier();

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid. Base: " + base + " mm. Top: " + top + " mm. Height: " + height +
                "mm. Area: " + getArea() + " sq.mm. Color: " + colorSupplier.getRandomColor();
    }

    @Override
    public double getArea() {
        return (base + top) * height / 2;
    }
}
