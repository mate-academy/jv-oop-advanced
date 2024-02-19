package core.basesyntax.figure;

import core.basesyntax.colors.Color;

public class Square extends Figure {
    private final double side;

    public Square(double side, Color randomColor) {
        super(randomColor);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + System.lineSeparator()
                + "area: " + calculateArea() + " sq. units"
                + System.lineSeparator()
                + "a: " + side + " units"
                + System.lineSeparator()
                + "color: " + getColor());
    }
}
