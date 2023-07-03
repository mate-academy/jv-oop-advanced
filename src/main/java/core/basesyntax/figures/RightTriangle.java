package core.basesyntax.figures;

public class RightTriangle extends Figures {
    private int firstLeg;
    private int secondLeg;

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                           + " sq.units, first leg: " + firstLeg
                           + " " + unitOrUnits(firstLeg) + ", second leg: " + secondLeg
                           + " " + unitOrUnits(secondLeg) + ", color: " + getColor().getInfo());
    }
}
