package core.basesyntax;

public class RightTriangle extends Figure {
    private static final String name = "Right Triangle";
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + name + ", area: "
                + getArea() + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg
                + " units, color: " + getColor());
    }
}
