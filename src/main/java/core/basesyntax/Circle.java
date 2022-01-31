package core.basesyntax;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, area: "
                + new DecimalFormat("#.##").format(getArea()) + " sq.units, radius: " + radius
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
