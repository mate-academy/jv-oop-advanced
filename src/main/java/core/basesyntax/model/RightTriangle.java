package core.basesyntax.model;

import core.basesyntax.ColorSupplier;
import core.basesyntax.FigureArea;

public class RightTriangle extends Figure {
    private final float side;
    private final float height;

    public RightTriangle() {
        this.side = Figure.getRandomNumber();
        this.height = Figure.getRandomNumber();
        super.setColour(ColorSupplier.getRandomColor());
    }

    @Override
    public double getArea() {
        return side * height / 2;
    }

    @Override
    public void draw() {

    }
}
