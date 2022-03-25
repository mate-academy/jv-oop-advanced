package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double findArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    public String draw() {
        return "Figure: triangle, " + "area: " + String.format("%.1f", findArea())
                + " sq.units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, color: " + getColor();
    }
}
