package core.basesyntax;

import static core.basesyntax.Name.CIRCLE;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        this.radius = radius;
        this.name = getName();
        this.area = getArea();
        this.color = getColor();
    }

    @Override
    public Name getName() {
        return CIRCLE;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public Color getColor() {
        return color == null ? new ColorSupplier().getRandomColor() : Color.WHITE;
    }

    @Override
    public void describe() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq, radius: "
                + getRadius() + " units, color: " + getColor());
    }
}
