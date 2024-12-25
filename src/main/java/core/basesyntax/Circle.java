package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private int radius;

    public Circle() {
        super();
        this.radius = new Random().nextInt(1, 10);
    }

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("\nCircle "
                + "color: " + this.getColor()
                + " area: " + this.getArea()
                + " radius: " + radius);
    }
}
