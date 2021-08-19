package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

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
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + getArea() + " sq.centimeters, firstLeg: "
                + getFirstLeg() + ", secondLeg: " + getSecondLeg() + ", color: " + getColor());
    }
}
