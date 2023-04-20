package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static final int FIGURES_COUNT = 5;
    public static final int MAX_SIDE = 20;
    public static final int MAX_RADIUS = 10;
    public static final String WHITE_COLOR = "WHITE";
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public int getRandomFiguresCount() {
        return random.nextInt(FIGURES_COUNT);
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor().toString();

        switch (getRandomFiguresCount()) {
            case 0:
                int radius = random.nextInt(MAX_SIDE);
                return new Circle(color, radius);
            case 1:
                int sideA = random.nextInt(MAX_SIDE);
                int sideB = random.nextInt(MAX_SIDE);
                int height = random.nextInt(MAX_SIDE);
                return new IsoscelesTrapezoid(color, sideA, sideB, height);
            case 2:
                int width = random.nextInt(MAX_SIDE);
                height = random.nextInt(MAX_SIDE);
                return new Rectangle(color, width, height);
            case 3:
                sideA = random.nextInt(MAX_SIDE);
                sideB = random.nextInt(MAX_SIDE);
                return new RightTriangle(color, sideA, sideB);
            default:
                int side = random.nextInt(MAX_SIDE);
                return new Square(color, side);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(WHITE_COLOR, MAX_RADIUS);
    }
}
