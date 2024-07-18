package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color,double firstLeg, double secondLeg) {
        super(color);
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String draw() {
        return "Figure: rightTriangle, area: "
                + String.format("%.2f",getArea()) + " sq. units, firstLeg: "
                + String.format("%.2f",getFirstLeg()) + " units, secondLeg: "
                + String.format("%.2f",getSecondLeg()) + " units, color: " + getColor();
    }
}
