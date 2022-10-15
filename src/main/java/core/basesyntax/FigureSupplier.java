package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int RANDOM_FIGURE = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int numberOfFigure = random.nextInt(RANDOM_FIGURE);
        Color color = colorSupplier.getRandomColor();
        switch (numberOfFigure) {
            case 1:
                return getRandomCircle(color);
            case 2:
                return getRandomSquare(color);
            case 3:
                return getRandomRectangle(color);
            case 4:
                return getRandomRightTriangle(color);
            default:
                return getRandomIsoscelesTrapezoid(color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getRandomCircle(Color randomColor) {
        int radius = random.nextInt(Figure.MAX_RANDOM_NUMBER);
        return new Circle(randomColor, radius);
    }

    private Figure getRandomIsoscelesTrapezoid(Color randomColor) {
        int firstSide = random.nextInt(Figure.MAX_RANDOM_NUMBER);
        int secondSide = random.nextInt(Figure.MAX_RANDOM_NUMBER);
        int height = random.nextInt(Figure.MAX_RANDOM_NUMBER);
        return new IsoscelesTrapezoid(randomColor, firstSide, secondSide, height);
    }

    private Figure getRandomRectangle(Color randomColor) {
        int width = random.nextInt(Figure.MAX_RANDOM_NUMBER);
        int height = random.nextInt(Figure.MAX_RANDOM_NUMBER);
        return new Rectangle(randomColor, width, height);
    }

    private Figure getRandomRightTriangle(Color randomColor) {
        int side = random.nextInt(Figure.MAX_RANDOM_NUMBER);
        return new RightTriangle(randomColor, side);
    }

    private Figure getRandomSquare(Color randomColor) {
        int side = random.nextInt(Figure.MAX_RANDOM_NUMBER);
        return new Square(randomColor, side);
    }
}
