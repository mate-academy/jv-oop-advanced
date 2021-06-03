package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upBase;
    private double downBase;
    private double leftBase;

    public double getUpBase() {
        return upBase;
    }

    public void setUpBase(double upBase) {
        this.upBase = upBase;
        calculateArea();
    }

    public double getDownBase() {
        return downBase;
    }

    public void setDownBase(double downBase) {
        this.downBase = downBase;
        calculateArea();
    }

    public double getLeftBase() {
        return leftBase;
    }

    public void setLeftBase(double leftBase) {
        this.leftBase = leftBase;
        calculateArea();
    }

    public double getRightBase() {
        return rightBase;
    }

    public void setRightBase(double rightBase) {
        this.rightBase = rightBase;
        calculateArea();
    }

    private double rightBase;

    public IsoscelesTrapezoid(String color,
                              double upBase,
                              double downBase,
                              double leftBase,
                              double rightBase) {
        this.upBase = upBase;
        this.downBase = downBase;
        this.leftBase = leftBase;
        this.rightBase = rightBase;
        setColor(color);
        calculateArea();
    }

    public double calculateArea() {
        return (upBase + downBase) * ((upBase + downBase) / 2) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure:  isosceles trapezoid, area: " + calculateArea()
                + " sq.units, upBase: " + upBase
                + " units, downBase: " + downBase
                + " units, rightBase: " + rightBase
                + " units, leftBase: " + leftBase
                + " units, color: " + getColor());
    }
}
