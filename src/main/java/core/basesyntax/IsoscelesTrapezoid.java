package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base;
    private double top;
    private double height;

    public IsoscelesTrapezoid(String color, double base, double top, double height) {
        super(color);
        this.base = base;
        this.top = top;
        this.height = height;
    }

    @Override
    public double area() {
        return ((base + top) * height) / 2;
    }

    @Override
    public double perimeter() {
        double side = Math.sqrt(Math.pow((base - top) / 2, 2) + Math.pow(height, 2));
        return base + top + 2 * side;
    }
}
