package core.basesyntax.figures;

import core.basesyntax.state.Figure;

public class RightTriangle extends Figure {
    private int sideA;
    private int sideB;

    public RightTriangle(String name) {
        super(name);
        sideA = (int)((Math.random() * 10) + 1);
        sideB = (int)((Math.random() * 10) + 1);
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
