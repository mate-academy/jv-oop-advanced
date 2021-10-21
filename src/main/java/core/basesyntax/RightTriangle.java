package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.setShape("Right Triangle");
        this.setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public RightTriangle() {
        this.firstLeg = new Random().nextInt(100);
        this.secondLeg = new Random().nextInt(100);
        this.setShape("Right Triangle");
    }

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
    public int getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void printInfo() {
        System.out.printf("Figure: %s , area: %s sq.units, firstLeg: %s units, "
                        + "secondLeg: %s units, color: %s%n", getShape(), getArea(),
                getFirstLeg(), getSecondLeg(), getColor());
    }
}
