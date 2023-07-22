package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private static final int MAX_SIZE_OF_SIDES = 15;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private String color;
    private int side;

    public Square() {

    }

    public Square(String color, int side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public void draw() {
        double area = side * side;
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: square, area: ").append(area).append(" sq.units, side: ");
        builder.append(side).append(" units, color: ").append(color);
        System.out.println(builder);
    }

    @Override
    public Square getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int randomSide = random.nextInt(MAX_SIZE_OF_SIDES);
        return new Square(randomColor, randomSide);
    }
}
