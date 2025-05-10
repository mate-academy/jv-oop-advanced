package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.setFirstLeg(firstLeg);
        this.setSecondLeg(secondLeg);
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void printInfo() {
        System.out.println(getColor() + " right triangle with first leg: " + getFirstLeg()
                + ", second leg: " + getSecondLeg() + " and area: " + getArea() + " Героям слава!");
    }
}
