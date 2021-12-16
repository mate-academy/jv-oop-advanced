package core.basesyntax;

import java.util.Locale;

public class Square extends Figure {
    private final int side;

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
        String drawSquare = String.format("Figure: square, area: %.1f sq.units, "
                            + "side: %d units, color: %s.",
                            getArea(), side, getColor().toLowerCase(Locale.ROOT));
        System.out.println(drawSquare);
    }
}
