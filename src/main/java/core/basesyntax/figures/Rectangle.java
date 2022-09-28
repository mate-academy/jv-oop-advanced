package core.basesyntax.figures;

import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class Rectangle extends Figure {
    private final String name = "rectangle";
    private int length;
    private int width;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Rectangle() {
    }

    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: ")
                .append(name)
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, length = ")
                .append(length)
                .append(" units, width = ")
                .append(width)
                .append(" units, color: ")
                .append(getColor());
        return stringBuilder.toString();
    }

    @Override
    public Figure getRandomProperties() {
        int randomLength = random.nextInt(100);
        int randomWidth = random.nextInt(100);
        String randomColor = colorSupplier.getRandomColor();
        Figure rectangle = new Rectangle(randomLength, randomWidth, randomColor);
        return rectangle;
    }
}
