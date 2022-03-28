package core.basesyntax.figures;

import core.basesyntax.Colors;
import core.basesyntax.Figure;
import core.basesyntax.FigureArea;

public class Square extends Figure implements FigureArea {
    private int side;

    public Square(Colors color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void messageInfo() {
        System.out.println("Figure: square, area: " + Math.rint(getArea())
                + " sq.units, side: " + side + " units, color: " + getColor());
    }
}
