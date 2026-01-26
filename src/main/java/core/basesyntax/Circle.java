package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private Random random;
    private double radius;

    public Circle() {
        this.random = new Random();
        this.radius = random.nextDouble(100, 1000);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: units, area: " + getArea() +
                " sq. units, radius: " + radius + " units, color: "
                + ColorSupplier.getRandomColor());
    }
}
