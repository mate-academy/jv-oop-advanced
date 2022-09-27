package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double area;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double findArea() {
        area = firstLeg * secondLeg * 0.5;
        return area;
    }

    @Override
    public String toString() {
        return "Figure: RightTriangle, "
                + "firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, area: " + area
                + " sq.units, " + "color: " + getColor();
    }
}
