package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public Circle() {

    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void print() {
        System.out.println("Figure: circle, area: " + getArea()
                + " radius: " + getRadius() + " units, color: " + getColor());
    }

    @Override
    public Figure getRandomFigure() {
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
        return new Circle(supplier.getRandomColor(), random.nextInt(100));
    }
}
