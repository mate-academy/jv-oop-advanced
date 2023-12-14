package core.basesyntax;

public class RightTriangle extends Figure {
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

    public void setSecondLeg(double seconLeg) {
        this.secondLeg = seconLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass()
                + ", area: " + this.getArea() + " sq. units,"
                + " first leg: " + this.firstLeg + " units, "
                + " second leg: " + this.secondLeg + " units, "
                + "color: " + this.getColor());
    }

    @Override
    public void calculateArea() {
        this.setArea(firstLeg * secondLeg * 0.5);
    }
}
