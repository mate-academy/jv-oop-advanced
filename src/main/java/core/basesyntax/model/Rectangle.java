package core.basesyntax.model;

import core.basesyntax.ColorSupplier;
import core.basesyntax.FigureArea;

public class Rectangle extends Figure{
    private final int sideA;
    private final int sideB;

    public Rectangle() {
        this.sideA = Figure.getRandomNumber();
        this.sideB = Figure.getRandomNumber();
        super.setColour(ColorSupplier.getRandomColor());
    }


    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {

    }
}
