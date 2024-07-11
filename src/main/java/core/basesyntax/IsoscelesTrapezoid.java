package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double leg;
    private double height;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double leg) {
        super(color, "trapezoid");
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.leg = leg;
    }

    @Override
    public double calculateArea() {
        double s = (firstBase + secondBase + 2 * leg) / 2;
        return Math.sqrt((s - firstBase) * (s - secondBase) * (s - leg) * (s - leg));
    }

    @Override
    protected String getAdditionalInfo() {
        String info = "firstBase: " + firstBase + " units, ";
        info += "secondBase: " + secondBase + " units, ";
        info += "leg: " + leg;
        return info;
    }
}
