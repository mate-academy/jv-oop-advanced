package core.basesyntax.entity;

import core.basesyntax.Figure;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        double area = side * side;
        return Math.round(area * 10.0) / 10.0;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder("Figure: square, ");
        stringBuilder.append("area: ").append(getArea()).append(" sq. units, ")
                .append("side: ").append(side).append(" units, ")
                .append("color: ").append(getColor());
        System.out.println(stringBuilder.toString());
    }
}
