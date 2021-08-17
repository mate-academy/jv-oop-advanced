package core.basesyntax.model;

import core.basesyntax.FigureArea;

public class Square extends Figure {
    private int side;


    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {

    }
}
