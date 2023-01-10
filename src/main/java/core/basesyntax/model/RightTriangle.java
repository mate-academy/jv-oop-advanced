package core.basesyntax.model;

import core.basesyntax.supplier.ColorSupplier;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
    }

    public RightTriangle() {
        this.firstLeg = getRandom().nextInt(100);
        this.secondLeg = getRandom().nextInt(100);
        setColor(new ColorSupplier().getRandomColor());
    }

    @Override
    public double getArea() {
        return (double) firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println(getStringBuilder().append(System.lineSeparator()).append(
                "This is a RIGHT TRIANGLE ")
                .append(System.lineSeparator()).append("Color is ").append(getColor())
                .append(System.lineSeparator()).append("firstLeg = ").append(firstLeg)
                .append(System.lineSeparator()).append("secondLeg = ").append(secondLeg)
                .append(System.lineSeparator()).append("Area = ").append(getArea()).toString());
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
}
