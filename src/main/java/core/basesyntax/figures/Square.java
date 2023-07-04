package core.basesyntax.figures;

import core.basesyntax.ColorEnum;

public class Square extends Figure {
    private final int side;

    public Square(ColorEnum color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (side * side);
    }

    public void draw() {
        System.out.println("Figure: " + "square, "
                + "area: " + calculateArea() + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + color.name().toLowerCase()
        );
    }
}
