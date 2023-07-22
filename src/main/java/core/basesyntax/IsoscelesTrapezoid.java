package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private static final int MAX_SIZE_OF_SIDES = 15;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private String color;
    private int side1;
    private int side2;
    private int height;

    public IsoscelesTrapezoid() {

    }

    public IsoscelesTrapezoid(String color, int side1, int side2, int height) {
        this.color = color;
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    @Override
    public void draw() {
        double area = (double) ((side1 + side2) / 2) * height;
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: isosceles trapezoid, area: ").append(area);
        builder.append(side1).append(" sq.units, side1: ").append(" sq.units, side2: ");
        builder.append(side2).append(" sq.units, height: ").append(height);
        builder.append(" units, color: ").append(color);
        System.out.println(builder);
    }

    @Override
    public IsoscelesTrapezoid getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int randomSide1 = random.nextInt(MAX_SIZE_OF_SIDES);
        int randomSide2 = random.nextInt(MAX_SIZE_OF_SIDES);
        int randomHeight = random.nextInt(MAX_SIZE_OF_SIDES);
        return new IsoscelesTrapezoid(randomColor, randomSide1, randomSide2, randomHeight);
    }
}
