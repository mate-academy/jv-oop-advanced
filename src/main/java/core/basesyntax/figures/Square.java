package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: square, area: " + String.format("%.1f",getArea())
                        + " sq. units, side: " + String.format("%.1f",side)
                        + " units, color: " + getColor()
        );
    }
}