package core.basesyntax.model;

import core.basesyntax.FigureArea;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;

    @Override
    public double getArea() {
        return (sideA + sideB) * 2 / height;
    }


    @Override
    public void draw() {

    }
}
