package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double width;
    private double length;
    private double height;

    public IsoscelesTrapezoid(String color, double width, double length, double height) {
        super(color);
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (width + length) / 2 * height;
    }

    @Override
    public String toString() {
        return "Figure: IsoscelesTrapezoid, area: " + getArea() + " sq. units, width: "
                + width + " units, length: "
                + length + " units, height: "
                + height + " units, color: " + getColor();
    }
}
