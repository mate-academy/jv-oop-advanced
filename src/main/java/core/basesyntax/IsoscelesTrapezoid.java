package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int leg;

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
    public Double area() {
        return (double) leg * leg - (firstBase - secondBase) * (firstBase - secondBase) / 4;
    }

    @Override
    public void info() {
        System.out.println("Figure: isosceles trapezoid, area: " + area()
                + " sq. units, first base: "
                + firstBase + ", second base: " + secondBase + ", leg: " + leg
                + " units, color: " + getColor());
    }
}
