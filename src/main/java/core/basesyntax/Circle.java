package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private static final int MAX_RADIUS = 50;
    private int radius;

    public Circle() {

    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getFormattedArea() {
        return Math.floor(getArea() * 100) / 100;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getFormattedArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor().toLowerCase());
    }

    @Override
    public Figure createRandomFigure() {
        return new Circle(new ColorSupplier().getRandomColor(), new Random().nextInt(MAX_RADIUS));
    }
}
