package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int leg;

    public IsoscelesTrapezoid(int a, int b, int c, String str) {
        this.firstBase = a;
        this.secondBase = b;
        this.leg = c;
        setColor(str);
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
    public Double calculateArea() {
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
