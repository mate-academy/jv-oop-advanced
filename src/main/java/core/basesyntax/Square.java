package core.basesyntax;

import java.text.DecimalFormat;

public class Square extends FigureObject {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: "
                + new DecimalFormat("#0.00").format(getArea())
                + " sq.units, side: "
                + side
                + " units, color:"
                + getColor());
    }

}
