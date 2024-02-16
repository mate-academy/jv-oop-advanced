package core.basesyntax.figure;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int height;

    public IsoscelesTrapezoid(String color, int firstLeg, int secondLeg, int height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((getFirstLeg() + getSecondLeg()) / 2.0) * getHeight();
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", firstLeg: " + getFirstLeg() + " units"
                + ", secondLeg: " + getSecondLeg() + " units"
                + ", height" + getHeight() + " units");
    }
}
