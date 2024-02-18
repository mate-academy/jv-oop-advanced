package core.basesyntax.figureshapes;

import core.basesyntax.Figure;
import core.basesyntax.FigureArea;

public class Square extends Figure implements FigureArea {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + calculateArea()
                + " sq. units, side: "
                + side
                + " units, color: "
                + getColor());
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
