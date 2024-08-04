package core.basesyntax.figures;

import java.util.Locale;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf(Locale.US, "Figure: square, area: %.1f sq. units, "
                        + "side: %.1f units, color: %s\n",
                getArea(), side, color);
    }
}
