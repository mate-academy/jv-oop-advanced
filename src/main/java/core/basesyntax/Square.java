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
        String squareInfo = "Figure: "
                + FigureTypes.SQUARE
                + ", area: "
                + getArea()
                + " sq.units, side: "
                + side
                + " units, color: "
                + getColor();
        System.out.println(squareInfo);
    }
}
