package core.basesyntax;

import java.util.Random;

public class Circle extends Figure implements Drawable {
    private double radius = new Random().nextInt(100);
    private Color color = Color.values()[new Random().nextInt(10)];

    @Override
    public double area() {
        return 3.14 * (radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + this.area() +
                " sq.units, radius: " + getRadius() + " units, color: " + getColor());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}


