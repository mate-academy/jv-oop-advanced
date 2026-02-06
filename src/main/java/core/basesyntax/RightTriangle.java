package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void drawAFigure() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: " + getColor().name().toLowerCase());
    }
}
