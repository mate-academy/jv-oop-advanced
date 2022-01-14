package core.basesyntax;

import java.util.Random;

public class Circle extends Figure implements GetArea {
    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();
    private int radius;

    public Circle() {
        setName("circle");
        setColor(color.getRandomColor().toString());
        this.radius = random.nextInt(100);
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + getName()
                + ", area: " + getArea()
                + " sq.units, radius: " + radius
                + " units, color: " + getColor().toLowerCase();
    }
}
