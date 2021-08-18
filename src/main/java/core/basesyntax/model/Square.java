package core.basesyntax.model;

import core.basesyntax.ColorSupplier;

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
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, side: " + side
                + ", colour: " + getColour());
    }

}
