package core.basesyntax.models;

import core.basesyntax.Figure;

public class RightTriangle implements Figure {
    private final String color;
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Color: " + color
                + "Type: Right Triangle "
                + "First Leg: " + firstLeg
                + "Second Leg: " + secondLeg);

    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    public String getColor() {
        return color;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }
}
