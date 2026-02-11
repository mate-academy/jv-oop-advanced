package core.basesyntax.model;

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
    public double getArea() {
        return 0.5 * (getFirstLeg() * getSecondLeg());
    }

    @Override
    public void draw() {
        System.out.printf("Figure: right triangle, area: %.2f, first leg: %.2f, "
                        + "second leg: %.2f, color: %s\n",
                        getArea(), getFirstLeg(), getSecondLeg(), getColor());
    }
}
