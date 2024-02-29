package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double leg;
    private double downBase;
    private double upBase;

    public IsoscelesTrapezoid(String color, double leg, double downBase, double upBase) {
        super(color);
        this.leg = leg;
        this.downBase = downBase;
        this.upBase = upBase;
    }

    @Override
    public String toString() {
        return super.toString()
                + "leg: " + leg
                + ", downBase: " + downBase
                + ", upBase: " + upBase;
    }
}
