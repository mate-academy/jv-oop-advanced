package core.basesyntax;

import java.text.DecimalFormat;

public class Circle extends FigureObject {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: "
                + new DecimalFormat("#0.00").format(getArea())
                + " sq.units, radius: "
                + radius
                + " units, color: "
                + getColor());
    }
}
