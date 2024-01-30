package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseSide;

    private int topSide;

    private int hight;

    public IsoscelesTrapezoid(String color, int baseSide, int topSide, int hight) {
        super(color);
        this.baseSide = baseSide;
        this.topSide = topSide;
        this.hight = hight;
        calcArea();
    }

    @Override
    public void calcArea() {
        setArea((double) (baseSide + topSide) / 2 * hight);
    }

    @Override
    public String toString() {
        return "Figure: isoscelesTrapezoid, area: " + getArea() + " sq. units, baseSide: "
                + baseSide + " units," + " topSide: " + topSide + " units,"
                + " hight: " + hight + " units,"
                + " color: " + getColor();
    }
}
