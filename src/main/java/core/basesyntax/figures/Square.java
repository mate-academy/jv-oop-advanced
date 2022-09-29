package core.basesyntax.figures;

import core.basesyntax.suppliers.Color;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + getFormatted(getArea())
                + " sq.units, side: "
                + getFormatted(getSide())
                + " color: "
                + getColor().name().toLowerCase());
    }
}
