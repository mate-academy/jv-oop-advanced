package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * 2);
    }

    public static Circle getRandomCircle() {
        Random random = new Random();
        String randomColor = new ColorSupplier().getRandomColor();
        int randomRadius = random.nextInt(VALUES_BOUND);

        return new Circle(randomColor, randomRadius);
    }

    @Override
    public void draw() {
        System.out.println(
                getClass().getName()
                + "{"
                + "color="
                + getColor()
                + " radius="
                + radius
                + " area="
                + getArea()
                + "}"
        );
    }
}
