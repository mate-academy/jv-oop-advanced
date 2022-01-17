package core.basesyntax;

public class Righttriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

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
    public String toDraw() {
        return "Figure: " + getFigureType() + ", area: " + getArea() + " sq.units, first leg: "
                + getFirstLeg() + " units, second leg: " + getSecondLeg()
                + " units, color: " + getColor();
    }
}
