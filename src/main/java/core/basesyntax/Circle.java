package core.basesyntax;

import java.util.Random;

public class Circle extends ColorSupplier {
    private double radius;

    public Circle() {
        this.radius = new Random().nextInt(100);
        {
            draw();
        }
    }

    public Circle(int radius) {
        this.radius = radius;

        {
            System.out.println("Figure: Circle, area: "
                    + getArea()
                    + " sq. units, radius : "
                    + radius
                    + " units, color: "
                    + "white");
        }
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("Figure: Circle, area: "
                + getArea()
                + " sq. units, radius : "
                + radius
                + " units, color: "
                + getRandomColor());
    }

    public static int staticBlocCall() {
        return 0;
    }

}
