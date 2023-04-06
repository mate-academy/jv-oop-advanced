package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private double radius;
    private Random random = new Random();

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
        setColor(random);
        this.color = getColor();
    }

    public Circle() {
        radius = random.nextDouble();
        setColor(random);
        this.color = getColor();
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: " + radius
                + " units, color: " + color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
