package core.basesyntax;

import java.text.DecimalFormat;

public class Circle extends FigureSupplier {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Назва: circle, radius: " + radius + ", area: "
                + df.format(getArea()) + ", колір: " + color);
    }
}

