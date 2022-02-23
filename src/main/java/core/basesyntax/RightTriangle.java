package core.basesyntax;

public class RightTriangle extends Figures {
    private double firstLeg;
    private double secondLeg;

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("RightTriangle: firstLeg: "
                + firstLeg + " secondLeg "
                + secondLeg + " color: " + getColor() + " area: " + getArea());
    }

}
