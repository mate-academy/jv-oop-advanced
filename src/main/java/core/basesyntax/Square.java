package core.basesyntax;

import java.text.DecimalFormat;

public class Square extends Figure {
    private double side;

    public Square(String name, String color, double side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + new DecimalFormat(ROUNDING_PATTERN).format(calculateArea())
                + " sq.units, " + "side: " + side + " units,"
                + " color: " + getColor());
    }
}
