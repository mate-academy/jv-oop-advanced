package core.basesyntax.figure;

import core.basesyntax.supplier.Color;

public class Rectangle extends Figure {
    private final double firstSide;
    private final double secondSide;

    public Rectangle(double firstSide, double secondSide, Color randomColor, String name) {
        super(randomColor, name);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        String formatedResult = "Figure: " + getFigureName()
                + System.lineSeparator()
                + "area: " + calculateArea() + " sq. units"
                + System.lineSeparator()
                + "a: " + firstSide + " units"
                + System.lineSeparator()
                + "b: " + secondSide + " units"
                + System.lineSeparator()
                + "color: " + getColor();
        System.out.println(formatedResult);
    }
}
