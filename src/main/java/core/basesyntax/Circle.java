package core.basesyntax;

import java.text.DecimalFormat;
//Circle has index 4

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getFigureArea() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Circle, area: "
                + new DecimalFormat("#0.00").format(getFigureArea())
                + " sq.units, radius: "
                + radius
                + " units, color: "
                + getColor());
    }
}
