package figures;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
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
    public void draw() {
        System.out.printf("Figure: right triangle, area: %4.2f sq.units"
                + ", firstLeg: %2d units"
                + ", secondLeg: %2d units"
                + ", color: %s%n", getArea(), getFirstLeg(), getSecondLeg(), getColor());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2.0;
    }
}
