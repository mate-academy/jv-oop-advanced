package core.basesyntax.figure;

import core.basesyntax.enums.Color;

public class Square extends AbstractFigure {
    private final double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units,"
                + " side: " + side + " units, color: " + getColor()
        );
    }

}
