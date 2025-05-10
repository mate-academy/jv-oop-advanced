package core.basesyntax.domain;

import core.basesyntax.domain.parent.Figure;

public class Rectangle extends Figure {
    private final double length;
    private final double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.printf(getClass().getSimpleName().toLowerCase() + ", area: %s sq. units, "
                        + "length: %s units, width %s units, color: %s%n",
                calculateArea(), length, width, color);
    }
}
