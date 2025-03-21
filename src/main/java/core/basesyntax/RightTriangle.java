package core.basesyntax;

public class RightTriangle extends Figure {

    private final Double firstLeg;
    private final Double secondLeg;

    public RightTriangle(String color, Double firstLeg, Double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public Double getFirstLeg() {
        return firstLeg;
    }

    public Double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: right triangle, area: %f sq. units, " +
                "firstLeg: %f units, secondLeg: %f units, color: %s", getArea(), getFirstLeg(), getSecondLeg(), color);
    }
}
