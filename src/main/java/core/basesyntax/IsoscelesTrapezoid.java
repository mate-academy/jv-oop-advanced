package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements BehaviorFigure {
    private double topSide;
    private double downSide;
    private double height;

    public IsoscelesTrapezoid(String color, double height, double downSide, double topSide) {
        super(color);
        this.height = height;
        this.downSide = downSide;
        this.topSide = topSide;
    }

    @Override
    public double getArea() {
        return (topSide + downSide) / 2 * height;
    }

    @Override
    public String toString() {
        return "Figure: "
                + "isosceles trapezoid, "
                + "area: "
                + getArea()
                + " sq.units, "
                + "topSide: "
                + topSide
                + " units, "
                + "downSide: "
                + downSide
                + " units, "
                + "height: "
                + height
                + " units, "
                + "color: "
                + getColor();
    }
}
