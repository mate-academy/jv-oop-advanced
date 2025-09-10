package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 20;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_FIGURE = 5;
    private static final String DEFAULT_COLOR = String.valueOf(Color.WHITE);

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = randomaizer(MAX_FIGURE);
        String color = colorSupplier.getRandomColor();

        switch (type) {
            case 0:
                int radius = 1 + randomaizer(MAX_SIZE);
                return new Circle(color, radius);
            case 1:
                int side = 1 + randomaizer(MAX_SIZE);
                return new Square(color, side);
            case 2:
                int width = 1 + randomaizer(MAX_SIZE);
                int height = 1 + randomaizer(MAX_SIZE);
                return new Rectangle(color, width, height);
            case 3:
                int rightSide = 1 + randomaizer(MAX_SIZE);
                return new RightTriangle(color, rightSide);
            default:
                int baseRight = 1 + randomaizer(MAX_SIZE);
                int baseLeft = 1 + randomaizer(MAX_SIZE);
                int trapHeight = 1 + randomaizer(MAX_SIZE);
                return new IsoscelesTrapezoid(color, baseRight, baseLeft, trapHeight);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int randomaizer(int d) {
        return random.nextInt(d);
    }
}
