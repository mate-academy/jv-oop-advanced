package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private double sideLength;

    public Square(String color, double sideLength) {
        super.setColor(color);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Type: circle, color: "
                + getColor()
                + " area: "
                + getArea()
                + " square units, side length: "
                + sideLength);
    }
}
