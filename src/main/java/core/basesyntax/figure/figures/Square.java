package core.basesyntax.figure.figures;

import core.basesyntax.figure.Figure;

public class Square extends Figure {
    private final int leg;

    public Square(String name, String color, int leg) {
        super(color);
        this.leg = leg;
    }

    @Override
    public double getArea() {
        return leg * leg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, Color: " + getColor()
                + ", Leg: " + leg
                + ", Area: " + getArea() + ".");
    }
}
