package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int leg;

    public IsoscelesTrapezoid(int firstBase, int secondBase, int leg, String color) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.leg = leg;
        setColor(color);
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getFirstBase() {
        return firstBase;
    }

    public void setFirstBase(int firstBase) {
        this.firstBase = firstBase;
    }

    public int getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(int secondBase) {
        this.secondBase = secondBase;
    }

    @Override
    public double calculateArea() {
        return (double) leg * leg - (firstBase - secondBase) * (firstBase - secondBase) / 4;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + calculateArea()
                + " sq. units, first base: "
                + firstBase + ", second base: " + secondBase + ", leg: " + leg
                + " units, color: " + getColor());
    }
}
