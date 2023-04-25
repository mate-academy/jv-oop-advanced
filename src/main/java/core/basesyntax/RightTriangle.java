package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, area: " + String.format("%.1f", calculateArea())
                + " firstLeg: " + firstLeg
                + " secondLeg: " + secondLeg
                + " color: " + getColor();
    }
}
