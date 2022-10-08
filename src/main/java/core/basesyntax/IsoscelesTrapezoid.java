package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double leg;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double leg) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.leg = leg;
    }

    public double getFirstBase() {
        return firstBase;
    }

    public void setFirstBase(double firstBase) {
        this.firstBase = firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(double secondBase) {
        this.secondBase = secondBase;
    }

    public double getLeg() {
        return leg;
    }

    public void setLeg(double leg) {
        this.leg = leg;
    }

    @Override
    public double getArea() {
        double height = (leg * leg) - ((firstBase - secondBase) * (firstBase - secondBase)) / 4;
        return (firstBase + secondBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea() + " sq.units, first base: "
                + firstBase + " units, second base: "
                + secondBase + " units, leg: "
                + leg + " units, color: "
                + getColor()
        );
    }
}
