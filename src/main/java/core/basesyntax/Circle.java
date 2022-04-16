package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private final double radius;

    {
        setName("circle");
    }

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle() {
        super(new ColorSupplier().getRandomColor());
        this.radius = new Random().nextInt(Figure.MAX_RANDOM_SIDE_VALUE);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, radius: %.1f units, color: %s\n",
                getName(), getArea(), radius, getColor());
    }
}
