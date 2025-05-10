package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double leg;
    private double downBase;
    private double upBase;
    private double height;

    public IsoscelesTrapezoid(String color, double leg, double downBase,
                              double upBase, double height) {
        super(color);
        this.leg = leg;
        this.downBase = downBase;
        this.upBase = upBase;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString()
                + "leg: " + leg
                + ", downBase: " + downBase
                + ", upBase: " + upBase
                + ", area: " + getArea();
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public double getArea() {
        return ((downBase + upBase) / 2) * height;
    }
}
