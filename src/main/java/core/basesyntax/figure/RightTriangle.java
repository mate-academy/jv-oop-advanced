package core.basesyntax.figure;

public class RightTriangle extends Figure{
    private double firstLeg;
    private double secondLeg;
    private static final String FIGURE_NAME = "right triangle";
    @Override
    public void draw() {
        String str = "Figure: " + FIGURE_NAME + ", area: " + getArea() + " sq.units, first leg: " + firstLeg + ", second leg: " + secondLeg;

        System.out.println(str);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    public void setLegs(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }
}
