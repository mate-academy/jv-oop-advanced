package core.basesyntax.models;

import core.basesyntax.enums.Color;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getSquare() {
        return (firstLeg * secondLeg) / 2f;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Figure: Triangle, "
                        + "Area: %s, "
                        + "First leg: %d, "
                        + "Second leg: %d, "
                        + "Color: %s",
                getSquare(), getFirstLeg(), getSecondLeg(), getColor()));
    }
}
