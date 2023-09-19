package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private double sideLength;

    public Square(String color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square | side length: " + String.format("%.2f", sideLength)
                + " | area: " + String.format("%.2f", calculateArea())
                + " | color: " + getColor());
    }
}
