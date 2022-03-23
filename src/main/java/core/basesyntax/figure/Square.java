package core.basesyntax.figure;

import java.util.Locale;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double countArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square, area:" + countArea()
                + " sq.units" + ", side " + getSide()
                + ", color: " + getColor().toLowerCase(Locale.ROOT));
    }
}
