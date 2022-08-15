package core.basesyntax;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
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
    public void draw() {
        System.out.println("Figure: circle, area: "
                + getArea()
                + " sq.units, radius: "
                + radius
                + " units, color: " + color);
    }

    @Override
    public double getArea() {
        return Double.parseDouble(new DecimalFormat("###.##")
                .format(Math.PI * radius * radius)
                .replace(',', '.'));
    }
}
