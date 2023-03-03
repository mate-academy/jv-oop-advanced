package core.basesyntax;

public class RightTriangle extends GetFigure {
    private static final String NAME = "RIGHT TRIANGLE";
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
        System.out.println("GetFigure: " + getClass().getSimpleName() + ", area: "
                + getArea() + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg
                + " units, color: " + getColor());
    }
}
