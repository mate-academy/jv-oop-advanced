package core.basesyntax;

public class RightTriangle extends AbstractFigure {

    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: right triangle, area: " + (firstLeg * secondLeg) / 2
                + " sq. units, legs: " + firstLeg + " units, " + secondLeg
                + " units, color: " + color);

    }
}
