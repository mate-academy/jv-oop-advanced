package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void drawTheFigure() {
        System.out.println("Figure: rectangle, area: "
                + getTheArea() + " sq.units, firstLeg: " + firstLeg
                + " sq.units, secondLeg: " + secondLeg
                + " units, color: " + getColor());
    }

    @Override
    public double getTheArea() {
        return (firstLeg * secondLeg) / 2.0;
    }
}
