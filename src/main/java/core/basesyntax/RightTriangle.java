package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: triangle, area: %s sq.units, firstLeg: %s units, secondLeg: %s units" +
                        ", color: %s", this.getArea(), this.firstLeg, this.secondLeg, this.getColor()));
    }
}
