package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private final int sideA;
    private final int sideB;
    private final String color;

    public Rectangle(int sideB, int sideA, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle" + ", area: " + area() + " sq. units"
                + ", length: " + sideA + " units, " + "sideDown: " + sideB + " units, "
                + "color: " + color);
    }

    @Override
    public double area() {
        return sideB * sideA;
    }
}
