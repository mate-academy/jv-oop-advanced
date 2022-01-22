package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, Drawable {
    private double base;
    private double top;
    private double height;
    private String color;

    public IsoscelesTrapezoid(double base, double top, double height, String color) {
        this.base = base;
        this.top = top;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (base + top) * height / 2;
    }

    @Override
    public String getColor() {
        ColorSupplier colorSupplier = new ColorSupplier();
        color = colorSupplier.getRandomColor();
        return color;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid. Base: " + base + " mm. Top: " + top + " mm. Height: "
                + height + "mm. Area: " + getArea() + " sq.mm. Color: " + color;
    }
}
