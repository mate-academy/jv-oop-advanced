package core.basesyntax;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private static final DecimalFormat decimalFormat = new DecimalFormat("#.##");
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
    public void draw() {
        String formattedArea = decimalFormat.format(getArea());
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", Area: "
                + formattedArea + " sq. units, Radius: "
                + radius + " Units, Color: " + super.getColor());
    }
}
