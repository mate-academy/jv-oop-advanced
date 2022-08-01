package core.basesyntax;

import java.text.DecimalFormat;

public class Square extends FigureObject {
    private double side;

    public Square(Color color, double sideA) {
        super(color);
        this.side = sideA;
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
