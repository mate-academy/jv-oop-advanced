package core.basesyntax.figures;

import core.basesyntax.enums.FigureName;

public class Square extends AbstractFigure {
    private static final int NUMBER_OF_SIDES = 4;
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getSquare() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return NUMBER_OF_SIDES * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureName.SQUARE.name().toLowerCase()
                + ", area: " + getSquare()
                + ", perimeter: " + getPerimeter()
                + ", side: " + side
                + ", color: " + super.getColor().toLowerCase());
    }
}
