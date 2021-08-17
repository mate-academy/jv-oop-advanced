package core.basesyntax.model;

import core.basesyntax.FigureArea;

public class Circle extends Figure {
    private int radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }


    @Override
    public void draw() {

    }
}
