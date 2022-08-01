package core.basesyntax;

public class RightTriangle extends Figure {
    private double secondLeg;
    private double firstLeg;

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
    public double calculate() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase()
                + ", area: " + calculate() + " sq.units"
                + ", firstLeg: " + getFirstLeg() + " units"
                + ", secondLeg: " + getSecondLeg() + " units"
                + ", color: " + getColor());
    }
}
