package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg = 7;
    private final int secondLeg = 5;

    @Override
    public double calculateArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public String toString() {
        return "Figure: rightTriangle, area: " + calculateArea()
                + " sq. units, firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: " + color;
    }
}
