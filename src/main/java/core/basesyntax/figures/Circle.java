package core.basesyntax.figures;

import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class Circle extends Figure {
    private final String name = "circle";
    private int radius;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Circle() {
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: ")
                .append(name)
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, radius = ")
                .append(radius)
                .append(" units, color: ")
                .append(getColor());
        return stringBuilder.toString();
    }

    @Override
    public Figure getRandomProperties() {
        int randomRadius = random.nextInt(100);
        String randomColor = colorSupplier.getRandomColor();
        Figure circle = new Circle(randomRadius, randomColor);
        return circle;
    }
}
