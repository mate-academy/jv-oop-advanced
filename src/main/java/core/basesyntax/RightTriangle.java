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
    double calculateArea() {
        return this.firstLeg * this.secondLeg * 0.5;
    }

    @Override
    void draw() {
        System.out.println("Figure: triangle, area: " + calculateArea() + " sq. units, firstLeg: "
                + this.firstLeg + " units, secondLeg: " + this.secondLeg
                + " units, color: " + super.getColor());
    }
}
