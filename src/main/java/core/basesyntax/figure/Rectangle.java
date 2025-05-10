package core.basesyntax.figure;

import core.basesyntax.colors.Color;

public class Rectangle extends Figure {
    private final double firstSide;
    private final double secondSide;

    public Rectangle(double firstSide, double secondSide, Color randomColor) {
        super(randomColor);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + System.lineSeparator()
                + "area: " + calculateArea() + " sq. units"
                + System.lineSeparator()
                + "a: " + firstSide + " units"
                + System.lineSeparator()
                + "b: " + secondSide + " units"
                + System.lineSeparator()
                + "color: " + getColor());
    }
}
