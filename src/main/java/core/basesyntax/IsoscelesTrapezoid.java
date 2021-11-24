package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double perpendicular;

    public IsoscelesTrapezoid(Color color, double sideA, double sideB, double perpendicular) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.perpendicular = perpendicular;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(double perpendicular) {
        this.perpendicular = perpendicular;
    }

    @Override
    public String drawing() {
        return " Figure: isosceles trapezoid, area: " + getArea() + " sq.units, "
                + "sideA: " + sideA + " units, "
                + "sideB: " + sideB + " units, "
                + "perpendicular " + perpendicular + " units, "
                + "color: " + getColor();
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2) * perpendicular;
    }
}
