package core.basesyntax.figure.figures;

import core.basesyntax.figure.Figure;

import java.util.Random;

public class Rectangle extends Figure {
    private final Random random = new Random();
    private static final String NAME_DEFAULT = "RECTANGLE";
    private int firstLeg;
    private int secondLeg;

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
    public void getDraw() {
        System.out.println("Figure: " + NAME_DEFAULT + ", Color: " + getColor() + ", First Leg: " + firstLeg + ", Second Leg: " + secondLeg + "Area: " + getArea() + ".");
    }
}
