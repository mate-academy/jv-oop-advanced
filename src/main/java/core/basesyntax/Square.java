package core.basesyntax;

import java.util.Locale;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return (double) side * side;
    }

    @Override
    public void draw() {
        System.out.println(String.format(Locale.US, "Figure: square, "
                        + "area: %.1f sq.units, side: %d units, color: %s",
                area(), this.side, this.getColor()));
    }
}

