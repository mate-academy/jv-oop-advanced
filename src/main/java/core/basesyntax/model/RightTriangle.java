package core.basesyntax.model;

import core.basesyntax.ColorSupplier;

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
        System.out.println("Figure: RightTriangle, area: " + getArea()
                + " sq.units, side: " + side
                + ", height: " + height
                + ", colour: " + getColour());
    }

}
