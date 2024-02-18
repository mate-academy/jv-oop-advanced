package core.basesyntax.figure;

import core.basesyntax.colors.Color;

public class RightTriangle extends Figure {
    private final double side;

    public RightTriangle(double side, Color randomColor) {
        super(randomColor, "RightTriangle");
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return ((side * side) * Math.sqrt(3)) / 4;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureName()
                + System.lineSeparator()
                + "area: " + calculateArea() + " sq. units"
                + System.lineSeparator()
                + "a: " + side + " units"
                + System.lineSeparator()
                + "color: " + getColor());
    }
}
