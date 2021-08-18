package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator, Draw {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle() {

    }

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    @Override
    public int getArea() {
        return (this.firstLeg * this.secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + getArea() + " sq.centimeters, firstLeg: "
                + getFirstLeg() + ", secondLeg: " + getSecondLeg() + ", color: " + getColor());
    }
}
