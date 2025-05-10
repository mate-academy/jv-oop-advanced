package core.basesyntax.domain;

import core.basesyntax.domain.parent.Figure;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf(getClass().getSimpleName().toLowerCase() + ", area: %s sq. units, "
                        + "side: %s units, color: %s%n", calculateArea(), side, color);
    }
}
