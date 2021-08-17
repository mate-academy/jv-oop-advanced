package core.basesyntax.model;

import core.basesyntax.FigureArea;

public class Rectangle extends Figure{
    private int sideA;
    private int sideB;


    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {

    }
}
