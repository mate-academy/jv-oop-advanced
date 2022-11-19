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

    public String drawFigure(RightTriangle rightTriangle) {
        return "Figure: " + rightTriangle.getName() + ", area: " + rightTriangle.getArea()
                + " sq.units, first leg: " + rightTriangle.getFirstLeg()
                + " units, second leg: " + rightTriangle.getSecondLeg()
                + " units, color: " + rightTriangle.getColor();
    }
}
