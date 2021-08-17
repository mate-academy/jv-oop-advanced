package core.basesyntax.model;

import core.basesyntax.FigureArea;

public class RightTriangle extends Figure {
    private float side;
    private float height;

    @Override
    public double getArea() {
        return side * height / 2;
    }

    @Override
    public void draw() {

    }
}
