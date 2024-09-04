package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
    }

    private double calculateAndSetArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String draw() {
        return "Figure: RightTriangle, area: " + calculateAndSetArea()
                + " sq. units, firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: " + getColor();
    }
}
