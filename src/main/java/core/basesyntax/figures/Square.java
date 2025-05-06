package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.enums.FigureType;

public class Square extends Figure {
    private final int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureType.SQUARE.name()
                + ", area: " + area() + " sq. units"
                    + ", side: " + side + " units, " + "color: " + getColor());
    }

    @Override
    public double area() {
        return side * side;
    }
}
