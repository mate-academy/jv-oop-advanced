package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 5;
    private static final int MAX_RANDOM_VALUE = 10;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_NUMBER)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), DEFAULT_CIRCLE_RADIUS);
    }

    private int getRandomValue() {
        return random.nextInt(MAX_RANDOM_VALUE) + 1;
    }

    private Figure getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int radius = getRandomValue();
        return new Circle(color, radius);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int upperBase = getRandomValue();
        int lowerBase = getRandomValue();
        int heightTrapezoid = getRandomValue();
        return new IsoscelesTrapezoid(color, upperBase, lowerBase, heightTrapezoid);
    }

    private Figure getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int width = getRandomValue();
        int height = getRandomValue();
        return new Rectangle(color, width, height);
    }

    private Figure getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int firstLeg = getRandomValue();
        int secondLeg = getRandomValue();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int radius = getRandomValue();
        return new Circle(color, radius);
    }
}
