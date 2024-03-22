package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private final int side;
    private final Random random = new Random();

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        double area = side * side;
        return Math.round(area * ROUNDING_PRECISION) / ROUNDING_PRECISION;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + getArea() + " units, side: "
                + side + " color: " + getColor());
    }
}
