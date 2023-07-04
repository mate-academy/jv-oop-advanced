package core.basesyntax.figures;

import core.basesyntax.ColorEnum;

public class Square extends Rectangle {
    private final int side;

    public Square(ColorEnum color, int side) {
        super(color, side, side);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return super.calculateArea();
    }

    public void draw() {
        System.out.println("Figure: " + "square, "
                + "area: " + calculateArea() + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + color.name().toLowerCase()
        );
    }
}
