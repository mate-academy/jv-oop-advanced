package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private int radius;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    public Circle() {
    }

    public Circle getRandomCircle() {
        String color = colorSupplier.getColorOfFigure();
        int radius = new Random().nextInt(15);
        return new Circle(radius, color);
    }

    public Circle getDefaultCircle() {
        String color = Color.WHITE.name();
        int radius = 10;
        return new Circle(radius, color);
    }

    @Override
    public double getArea() {
        return (radius * radius) * Math.PI;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, radius: " + radius + ", area: " + getArea()
                + ", color: " + getColor());
    }
}
