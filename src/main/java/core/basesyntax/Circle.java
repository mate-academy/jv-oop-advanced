package core.basesyntax;

import java.text.DecimalFormat;
import java.util.Random;

public class Circle extends ColorSupplier {
    private int radius;
    private String color;

    public Circle() {
        this.radius = new Random().nextInt(4) + 1;
        this.color = getRandomColor();
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
