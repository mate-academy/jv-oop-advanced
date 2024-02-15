package core.basesyntax.figure;

import core.basesyntax.supplier.Color;

public class RightTriangle extends Figure {
    private final double side;

    public RightTriangle(double side, Color randomColor, String name) {
        super(randomColor, name);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return ((side * side) * Math.sqrt(3)) / 4;
    }

    @Override
    public void draw() {
        String formatedResult = "Figure: " + getFigureName()
                + System.lineSeparator()
                + "area: " + calculateArea() + " sq. units"
                + System.lineSeparator()
                + "a: " + side + " units"
                + System.lineSeparator()
                + "color: " + getColor();
        System.out.println(formatedResult);
    }
}
