package core.basesyntax.figure;

import static java.lang.Math.pow;

public class Square extends Figure {

    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return pow(side, 2);
    }

    @Override
    public String toString() {
        return super.toString()
                + ", side: " + side;
    }
}
