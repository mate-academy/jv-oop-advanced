package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double lowerBase;
    private double upperBase;
    private double lateralSide;

    public IsoscelesTrapezoid(String color, double lowerBase,
                              double upperBase, double lateralSide) {
        super(color);
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.lateralSide = lateralSide;
    }

    @Override
    public void figureInfo() {
        System.out.println(String.format("Figure: isosceles trapezoid, area: %f sq.units,"
                        + " lowerBase: %f units, upperBase: %f  units, lateralSide : %f  units,"
                        + " color: %s", getArea(), lowerBase, upperBase, lateralSide,
                        super.getColor()));

    }

    @Override
    public double getArea() {
        return (lowerBase + upperBase) / 2
                * Math.sqrt(lateralSide * lateralSide - (Math.pow((lowerBase - upperBase),2)) / 4);
    }
}
