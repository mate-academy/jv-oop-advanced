package core.basesyntax;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private double radius;
    private DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        double area = 3.14 * radius * 2;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: "
                + decimalFormat.format(getArea())
                + " units, radius: "
                + radius
                + " units, color:" + color);
    }
}
