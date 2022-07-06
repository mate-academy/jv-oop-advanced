package core.basesyntax;

public class RightTriangle extends Figure implements FigureInfo {
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
    public double area() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + " area: " + area() + " sq.units, 1 leg: "
                + firstLeg + " units, 2 leg: " + secondLeg + " units, color: " + getColor());
    }
}
