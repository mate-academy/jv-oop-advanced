package core.basesyntax;

public class Rectangle extends Figure implements Behavior {
    private int firstLeg;
    private int secondLeg;

    public Rectangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg  * secondLeg;
    }
}
