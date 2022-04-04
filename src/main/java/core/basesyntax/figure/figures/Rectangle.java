package core.basesyntax.figure.figures;

import core.basesyntax.figure.Figure;

public class Rectangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public Rectangle(String name, String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, Color: " + getColor()
                + ", First Leg: " + firstLeg
                + ", Second Leg: " + secondLeg
                + " Area: " + getArea() + ".");
    }
}
