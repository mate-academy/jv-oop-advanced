package core.basesyntax;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private int radius;

    public Circle(String colour, int radius) {
        super(colour, "Circle");
        this.radius = radius;
    }

    public void setRadius() {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        DecimalFormat dec = new DecimalFormat("#0.0");
        System.out.println("Figure: " + getName() + ","
                + " area: " + dec.format(getArea()) + " sq. units,"
                + " colour: " + getColour() + ","
                + " radius: " + getRadius());
    }
}
