package core.basesyntax;

public class RightTriangle extends Figure implements Drowable, CalculateArea {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg) {
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
    }

    public double getFirstLeg() {
        return this.firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return this.secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double area() {
        return (firstLeg*secondLeg)/2;
    }

    @Override
    public void draw() {
        System.out.println("This is right triangle with first leg - "
                + this.firstLeg + ", second leg - " + this.secondLeg
                        + " and color - " + this.getColor());
    }
}
