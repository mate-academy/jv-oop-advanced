package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, area: "
                + area()
                + "sq. units, firstLeg: "
                + firstLeg
                + " units, "
                + "secondLeg: "
                + secondLeg
                + " units, "
                + "color: "
                + getColor();
    }

    @Override
    public double area() {
        return (firstLeg * secondLeg) / 2;
    }
}
