package core.basesyntax;

import java.text.DecimalFormat;

public class Rectangle extends FigureObject {
    private double length;
    private double height;

    public Rectangle(Color color, double length, double height) {
        super(color);
        this.length = length;
        this.height = height;
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
