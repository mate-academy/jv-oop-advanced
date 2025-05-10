package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double findArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public String draw() {
        return "Figure: RightTriangle, "
                + "firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, area: " + findArea()
                + " sq.units, " + "color: " + getColor();
    }
}
