package core.basesyntax.figures;

import core.basesyntax.dataprocessor.ColorSupplier;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double area() {
        return Math.pow(getSide(), 2);
    }

    @Override
    public void draw() {
        ColorSupplier colorSupplier = new ColorSupplier();
        System.out.println("Figure: square, area: " + area() + " sq.unit, side: "
                + getSide() + " units, color: " + colorSupplier.getRandomColor());
    }
}
