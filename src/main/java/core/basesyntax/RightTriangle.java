package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String colour) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColour(colour);
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: righttriangle, " + "area: " + getArea() + " sq.units, "
                + "firstLeg: " + firstLeg + " units, " + "secondLeg: " + secondLeg + " units, "
                + "color: " + getColour());
    }
}
