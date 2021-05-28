package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private final double side;
    private final double topSide;
    private final double downSide;

    public IsoscelesTrapezoid(double side, double topSide, double downSide, String color) {
        this.side = side;
        this.topSide = topSide;
        this.downSide = downSide;
        this.color = color;
    }

    @Override
    public String toString() {
        return "IsoscelesTrapezoid{"
                + "area="
                + getArea()
                + " sq.units"
                + ", side="
                + side
                + " units"
                + ", topSide="
                + topSide
                + " units"
                + ", downSide="
                + downSide
                + " units"
                + ", color='"
                + color
                + '\''
                + '}';
    }

    @Override
    public double getArea() {
        return ((topSide + downSide) / 2)
                * Math.sqrt(side * side - ((downSide - topSide) * (downSide - topSide) / 4));
    }
}
