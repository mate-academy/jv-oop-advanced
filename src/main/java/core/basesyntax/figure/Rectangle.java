package core.basesyntax.figure;

import core.basesyntax.figure.enums.Color;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, Color color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    @Override
    public void draw() {
        double area = firstSide * secondSide;
        System.out.println("Figure: rectangle, "
                + "area: " + area + " sq. units, "
                + "first side: " + firstSide + " units, "
                + "second side: " + secondSide + " units");
    }
}
