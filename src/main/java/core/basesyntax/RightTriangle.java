package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);

        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public void drawArea() {
        double area = 0.5 * this.firstLeg * this.secondLeg;

        System.out.println("Figure: right triangle, " + "area: " + area + " sq. units, first leg: "
                + this.firstLeg + " units, " + "second leg: "
                + this.secondLeg + ", color: " + this.getColor());
    }
}
