package core.basesyntax;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getInformation() {
        return "Figure: circle, area: " + new DecimalFormat("#.##").format(getArea())
                + " sq.units, radius: " + radius + " units, color: " + getColor();
    }
}
