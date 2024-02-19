package core.basesyntax.figures;

import core.basesyntax.Color;

public class Square extends Figure {
    private double sideLength;
    private Color color;

    public Square(Color color, double sideLength) {
        this.color = color;
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideLength, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + calculateArea() + " sq. units, side length: "
                + sideLength + " units, color: " + color);
    }
}
