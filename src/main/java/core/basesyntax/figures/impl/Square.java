package core.basesyntax.figures.impl;

import core.basesyntax.enums.Color;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getSquare() {
        return side * side;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        String square = String.format("%.1f", getSquare());
        builder.append("Figure: square, area: ").append(square).append(" sq.units, ");
        builder.append("side: ").append(side).append(" units, color: ").append(getColor());
        System.out.println(builder);
    }
}
