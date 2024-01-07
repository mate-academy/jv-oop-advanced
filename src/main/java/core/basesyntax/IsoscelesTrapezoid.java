package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int lateralSide;
    private int firstLeg;
    private int secondLeg;

    public IsoscelesTrapezoid(int firstLeg, int secondLeg, int lateralSide, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.lateralSide = lateralSide;
        super.color = color;
    }

    @Override
    public double getArea() {
        return Math.pow(firstLeg - ((secondLeg - firstLeg) / 2), 0.5);
    }

    @Override
    public String toString() {
        return "Figure: IsoscelesTrapezoid, firstLeg: "
                + firstLeg
                + ", secondLeg: "
                + secondLeg
                + ", lateralSide: "
                + lateralSide
                + ", color: "
                + color;
    }
}
