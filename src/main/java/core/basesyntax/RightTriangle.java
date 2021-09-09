package core.basesyntax;

public class RightTriangle extends ColorSupplier implements Figure {
    private int firstLeg;
    private int secondLeg;

    public void setParameters(int firstLeg,int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return ((firstLeg * secondLeg) / 2);
    }

    @Override
    public String behaviour() {
        return "Figure: right triangle, area: " + getArea() + " sq.units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg + " units, color: " + getRandomColor();
    }
}
