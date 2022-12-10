package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public String drawTheFigure() {
        return "Figure: triangle, area: " + calculateArea() + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: " + color.toLowerCase();
    }
}
