package core.basesyntax.model;

import core.basesyntax.ColorSupplier;
import core.basesyntax.FigureArea;

public class Square extends Figure {
    private final int side;

    public Square() {
        this.side = Figure.getRandomNumber();
        super.setColour(ColorSupplier.getRandomColor());
    }


    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {

    }
}
