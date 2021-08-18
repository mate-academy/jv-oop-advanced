package core.basesyntax;

public class Rectangle extends Figure implements Behavior {
    private int firstLeg;
    private int secondLeg;

    public void setRectangle(int firstLeg, int secondLeg, String color, String name) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.setName(name);
        super.setColor(color);

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
