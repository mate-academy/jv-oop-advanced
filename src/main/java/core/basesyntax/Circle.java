package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private static final int MAX_SIZE_OF_SIDES = 15;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private String color;
    private double radius;

    public Circle() {

    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void draw() {
        double area = Math.PI * radius * radius;
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: circle, area: ").append(area).append(" sq.units, radius: ");
        builder.append(radius).append(" units, color: ").append(color);
        System.out.println(builder);
    }

    @Override
    public Circle getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int randomRadius = random.nextInt(MAX_SIZE_OF_SIDES);
        return new Circle(randomColor, randomRadius);
    }
}
