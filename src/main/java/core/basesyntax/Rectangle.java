package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private static final int MAX_SIZE_OF_SIDES = 15;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private String color;
    private int side1;
    private int side2;

    public Rectangle() {

    }

    public Rectangle(String color, int side1, int side2) {
        this.color = color;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void draw() {
        double area = side1 * side2;
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: rectangle, area: ").append(area).append(" sq.units, side1: ");
        builder.append(side1).append(" sq.units, side2: ").append(side2);
        builder.append(" units, color: ").append(color);
        System.out.println(builder);
    }

    @Override
    public Rectangle getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int randomSide1 = random.nextInt(MAX_SIZE_OF_SIDES);
        int randomSide2 = random.nextInt(MAX_SIZE_OF_SIDES);
        return new Rectangle(randomColor, randomSide1, randomSide2);
    }
}
