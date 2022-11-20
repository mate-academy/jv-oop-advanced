package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

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
    public double getArea() {
        return firstLeg * secondLeg / 2.0;
    }

    public void drawFigure() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq.units, first leg: " + getFirstLeg()
                + " units, second leg: " + getSecondLeg()
                + " units, color: " + getColor());
    }
}
