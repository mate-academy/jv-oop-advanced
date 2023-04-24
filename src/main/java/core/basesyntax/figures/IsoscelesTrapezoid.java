package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private final double topSide;
    private final double bottomSide;
    private final double hight;

    public IsoscelesTrapezoid(String color, double topSide, double bottomSide, double hight) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.hight = hight;
    }

    public double getTopSide() {
        return topSide;
    }

    public double getBottomSide() {
        return bottomSide;
    }

    public double getHight() {
        return hight;
    }

    @Override
    public double getArea() {
        return (topSide + bottomSide) / 2 * hight;
    }

    @Override
    public String draw() {
        return "Figure: Isosceles Trapezoid, area: "
                + getArea() + " sq.units, topSide: "
                + getTopSide() + " units, bottomSide: "
                + getBottomSide() + " units, hight: "
                + getHight() + " units, color: "
                + getColor();
    }
}
