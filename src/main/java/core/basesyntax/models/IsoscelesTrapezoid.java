package core.basesyntax.models;

import core.basesyntax.enums.Color;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(Color color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getSquare() {
        return firstSide * height / 2f * height;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Figure: Trapezoid, "
                        + "Area: %s, "
                        + "First side: %d, "
                        + "Second side: %s, "
                        + "Height: %d, Color: %s",
                getSquare(), getFirstSide(), getSecondSide(), getHeight(), getColor()));
    }
}
