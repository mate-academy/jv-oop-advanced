package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private final double height;
    private final double topSide;
    private final double downSide;

    public IsoscelesTrapezoid(double height, double topSide, double downSide, String color) {
        this.height = height;
        this.topSide = topSide;
        this.downSide = downSide;
        this.setColor(color);
    }

    @Override
    public String toString() {
        return "Isosceles Trapezoid{"
                + "area="
                + getArea()
                + " sq.units"
                + ", side="
                + height
                + " units"
                + ", topSide="
                + topSide
                + " units"
                + ", downSide="
                + downSide
                + " units"
                + ", color='"
                + getColor()
                + '\''
                + '}';
    }

    @Override
    public double getArea() {
        return ((topSide + downSide) / 2) * height;
    }
}
