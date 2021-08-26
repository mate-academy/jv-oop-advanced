package core.basesyntax;

import java.awt.Color;

public class Square extends Figure {
    private final int side;

    public Square(int side, Color color, FigureTypes name) {
        super.setName(name);
        super.setColor(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        StringBuilder squareBuilder = new StringBuilder();
        squareBuilder
                .append("Figure: ")
                .append(FigureTypes.SQUARE)
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, side: ")
                .append(side)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(squareBuilder);
    }
}
