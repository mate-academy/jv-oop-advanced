package core.basesyntax;

import static core.basesyntax.Shape.CIRCLE;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {

        this.color = color;
        this.radius = radius;
        this.shape = getName();
    }

    @Override
    public Shape getName() {
        return CIRCLE;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void describe() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq, radius: "
                + getRadius() + " units, color: " + getColor());
    }
}
