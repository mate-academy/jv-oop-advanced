package core.basesyntax;

public class RightTriangle extends Figures implements Behaviour {
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
        return (secondLeg * firstLeg) / 2;
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units, first Leg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, color: " + getColor();
    }
}
