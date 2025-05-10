package core.basesyntax;

import java.util.Random;

public class Rectangle extends ColorSupplier {
    private int width;
    private int height;

    public Rectangle() {
        this.width = new Random().nextInt(100);
        this.height = new Random().nextInt(100);
        {
            draw();
        }
    }

    public void draw() {
        System.out.println("Figure: Rectangle, area: "
                + getArea()
                + " sq. units, width: "
                + width
                + " units, "
                + " sq. units, height: "
                + height
                + " units, color: "
                + getRandomColor());
    }

    public double getArea() {
        return width * height;
    }
}
