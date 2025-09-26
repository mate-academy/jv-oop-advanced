package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
        area = (float) (firstLeg * secondLeg) / 2;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, area: " + area + " sq. units, first leg: "
                + firstLeg + " sq. units, second leg: "
                + secondLeg + " units, color: " + color;
    }
}
