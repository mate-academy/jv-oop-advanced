package core.basesyntax.figures;

import core.basesyntax.state.Figure;

public class RightTriangle extends Figure {
    private int sideA;
    private int sideB;

    public RightTriangle(String name, String color, int sideA, int sideB) {
        super(name, color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB / 2;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq. cm, first side: %d cm, second side: %d cm, "
                + "color: %s\n", getName(), getArea(), sideA, sideB, getColor());
    }
}
