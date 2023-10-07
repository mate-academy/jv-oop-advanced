package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void printfInfoAboutFigure() {
        System.out.println("Figure: triangle, area: " + 0.5 * firstLeg * secondLeg
                + " sq.units, firstLeg: " + firstLeg + " sq.units, secondLeg: " + secondLeg
                + " units, color: " + getColor());
    }
}
