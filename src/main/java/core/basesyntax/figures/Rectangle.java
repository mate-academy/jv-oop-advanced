package core.basesyntax.figures;

import core.basesyntax.colors.Color;

public class Rectangle extends Figure {
    private static final double AREA_MULTIPLIER = 2;
    private final double firstSide;
    private final double secondSide;

    public Rectangle(Color color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle\nColor: " + getColor().name()
                + "\nArea: " + calculateArea()
                + "\nFirst side: " + firstSide
                + "\nSecond side: " + secondSide);
    }

    @Override
    public double calculateArea() {
        return AREA_MULTIPLIER * (firstSide + secondSide);
    }
}
