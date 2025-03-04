package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstLeg;
    private double secondLeg;

    public IsoscelesTrapezoid(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: "
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

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstSide) {
        this.firstLeg = firstSide;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondSide) {
        this.secondLeg = secondSide;
    }
}
