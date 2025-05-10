package core.basesyntax;

public class RightTriangle extends Figure {
    private double leg1;
    private double leg2;

    public RightTriangle(String color, double leg1, double leg2) {
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public double getArea() {
        return (leg1 * leg2) / 2;
    }

    @Override
    public String getAdditionalInfo() {
        return "firstLeg: " + leg1 + " units, secondLeg: " + leg2 + " units";
    }
}
