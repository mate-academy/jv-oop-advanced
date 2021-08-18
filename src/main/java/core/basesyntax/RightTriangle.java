package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
    }

    @Override
    public double countArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: right triangle, area: " + countArea() + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg + "color: " + color);
    }
}
