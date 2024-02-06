package core.basesyntax;

public class RightTriangle extends Figure implements CalculateArea {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void figureInfo() {
        System.out.println(String.format("Figure: right triangle, area: %f sq.units, firstLeg:"
                        + " %f units, secondLeg: %f  units, color: %s", getArea(), firstLeg,
                                secondLeg, super.getColor()));
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
