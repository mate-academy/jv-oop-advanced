package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {

    private final Random random = new Random();
    private String color = ColorSupplier.getRandomColor();
    private int radius = random.nextInt(10);

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public double getArea() {
        return 3.14 * (radius * radius);
    }

    @Override
    public String toString() {
        return "Figure: " + getName()
                + ", area: " + getArea()
                + ", radius: " + getRadius()
                + ", color: " + getColor();
    }

    @Override
    public String getDraw() {
        return color;
    }
}
