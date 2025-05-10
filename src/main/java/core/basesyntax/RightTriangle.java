package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public int getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void printInfo() {
        System.out.printf("Figure: Right Triangle , area: %s sq.units, firstLeg: %s units, "
                        + "secondLeg: %s units, color: %s%n", getArea(),
                firstLeg, secondLeg, getColor());
    }
}
