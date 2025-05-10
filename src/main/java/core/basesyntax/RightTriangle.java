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

    public double getLeg2() {
        return secondLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setLeg2(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle\narea: " + getArea() + " sq.units\nfirst leg: "
                + firstLeg + " units\nsecond leg " + secondLeg + " units\ncolor: " + getColor());
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }
}
