package core.basesyntax;

public class Rectangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public void drawable() {
        System.out.println("Figure: Rectangle, area: " + String.format("%.2f",getArea())
                + " sq.units, firstLeg=" + firstLeg
                + ", secondLeg=" + secondLeg
                + ", color=" + getColor());
    }
}
