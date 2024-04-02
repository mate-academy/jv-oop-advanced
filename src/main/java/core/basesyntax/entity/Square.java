package core.basesyntax.entity;

import core.basesyntax.Figure;

public class Square extends Figure {
    public static final String TEXT_SIDE = "side: ";
    public static final String TEXT_FIGURE = "Figure: square, ";
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder(TEXT_FIGURE);
        stringBuilder.append(TEXT_AREA)
                .append(Math.round(getArea() * 10.0) / 10.0).append(TEXT_SQ_UNITS)
                .append(TEXT_SIDE).append(side).append(TEXT_UNITS)
                .append(TEXT_COLOR).append(getColor());
        System.out.println(stringBuilder.toString());
    }
}
