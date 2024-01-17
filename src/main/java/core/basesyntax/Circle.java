package core.basesyntax;

import java.text.DecimalFormat;

public class Circle extends FigureSupplier {
    private int radius;
    private String color;

    public Circle() {
        this.radius = defaultRadius;
        this.color = defaultColor;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Name: circle, radius: " + radius + ", area: "
                + df.format(getArea()) + ", color: " + color);
    }
}

