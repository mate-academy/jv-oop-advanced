package core.basesyntax;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        String formattedArea = decimalFormat.format(area).replace(',', '.');
        return Double.parseDouble(formattedArea);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, "
                + "radius: " + radius + " units, color: " + getColor());
    }
}
