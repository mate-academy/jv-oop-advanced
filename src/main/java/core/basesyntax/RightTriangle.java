package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;
    private String color;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public int getArea() {
        return (int) (0.5 * firstLeg * secondLeg);
    }

    @Override
    public String draw() {
        return "Figure: rightTriangle, area: " + getArea() + " sg. units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + color;
    }
}

