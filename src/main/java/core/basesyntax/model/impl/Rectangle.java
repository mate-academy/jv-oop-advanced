package core.basesyntax.model.impl;

import core.basesyntax.model.Figure;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: rectangle, area: %.2f sq. units, "
                        + "first side: %d units, second side: %d, color: %s%n",
                calculateArea(), firstSide, secondSide, color
        );
    }
}
