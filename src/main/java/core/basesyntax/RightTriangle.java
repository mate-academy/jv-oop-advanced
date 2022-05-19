package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void drawInfo() {
        System.out.println("Right Triangle. First Leg: " + firstLeg + ". Second Leg: " + secondLeg
                + ". Area: " + getArea() + ". Color: " + getColor());
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

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
}
