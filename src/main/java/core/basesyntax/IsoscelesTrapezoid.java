package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstTrapezoidBase;
    private double secondTrapezoidBase;
    private double height;

    public IsoscelesTrapezoid(String color, double firstTrapezoidBase,
                              double secondTrapezoidBase, double height) {
        super(Color.valueOf(color));
        this.firstTrapezoidBase = firstTrapezoidBase;
        this.secondTrapezoidBase = secondTrapezoidBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstTrapezoidBase + secondTrapezoidBase) / 2 * height;
    }

    @Override
    public String draw() {
        return "Figure: isoscelesTrapezoid, "
                + "area: "                  + getArea()             + " sq.units, "
                + "firstTrapezoidBase: "    + firstTrapezoidBase    + " sq.units, "
                + "secondTrapezoidBase: "   + secondTrapezoidBase   + " sq.units, "
                + "height: "                + height                + " sq.units, "
                + "color: "                 + getColor();
    }
}
