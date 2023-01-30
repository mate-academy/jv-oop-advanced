package core.basesyntax;

public class RightTriangle extends Figures {
    private int firstLeg;
    private int secondLeg;
    private final String name = "right triangle";

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    @Override
    public double getArea() {
        return ((double) secondLeg * (double) firstLeg) / 2;
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units, first leg: " + firstLeg
                + " units, second leg: " + secondLeg
                + " units, color: " + getColor();
    }
}
