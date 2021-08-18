package core.basesyntax.model;

import core.basesyntax.ColorSupplier;

public class Circle extends Figure {
    private final int radius;

    public Circle() {
        this.radius = Figure.getRandomNumber();
        super.setColour(ColorSupplier.getRandomColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, radius: " + radius
                + ", colour: " + getColour());

    }

}
