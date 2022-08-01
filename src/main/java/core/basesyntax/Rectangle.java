package core.basesyntax;

import java.text.DecimalFormat;

public class Rectangle extends FigureObject {
    private double length;
    private double height;

    public Rectangle(Color color, double sideA, double sideB) {
        super(color);
        this.length = sideA;
        this.height = sideB;
    }

    @Override
    public double getArea() {
        return length * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: "
                + new DecimalFormat("#0.00").format(getArea())
                + " sq.units, sideA: "
                + length
                + " units, sideB: "
                + height
                + " units, color: "
                + getColor());
    }
}
