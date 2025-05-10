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
    public void print() {
        System.out.println("Figure: Right Triangle, area: " + getArea()
                + " sq.units, firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg
                + " units color: " + getColor());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
