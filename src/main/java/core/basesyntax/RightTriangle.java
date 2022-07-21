package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private static final int RANGE_COLOR_INDEX = Color.values().length;
    private static final int MAX_RANDOM_VALUE = 256;
    private double side;
    private Random random = new Random();

    public RightTriangle(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right triangle, area: "
                + getArea()
                + " sq.units, side: "
                + side
                + " units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return (side * side) * (Math.sqrt(3) / 4);
    }
}
