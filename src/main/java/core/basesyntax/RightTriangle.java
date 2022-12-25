package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
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
    public void draw() {
        System.out.println("Figure: right triangle," + "  area: "
                + gerArea() + " units," + " firstLeg: "
                + firstLeg + " units," + " secondLeg: "
                + secondLeg + " color: " + getColor());
    }

    @Override
    public double gerArea() {
        return 0.5 * getFirstLeg() * getSecondLeg();
    }
}
