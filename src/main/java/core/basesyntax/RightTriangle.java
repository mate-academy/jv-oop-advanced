package core.basesyntax;

public class RightTriangle extends Figures implements Behaviour {
    private int firstLeg;
    private int secondLeg;

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    @Override
    public double getArea() {
        return (secondLeg * firstLeg) / 2;
    }
}
