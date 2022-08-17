package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_RANDOM_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        FigureType type = FigureType.values()[random.nextInt(FigureType.values().length)];
        Color color = colorSupplier.getRandomColor();
        int firstSize = random.nextInt(MAX_RANDOM_NUMBER);
        switch (type) {
            case CIRCLE:
                return new Circle(color, firstSize);
            case SQUARE:
                return new Square(color, firstSize);
            case RECTANGLE:
                return new Rectangle(color, firstSize, random.nextInt(MAX_RANDOM_NUMBER));
            case TRIANGLE:
                return new RightTriangle(color, firstSize);
            default:
            case TRAPEZOID:
                return new IsoscelesTrapezoid(color, firstSize, random.nextInt(MAX_RANDOM_NUMBER),
                        random.nextInt(MAX_RANDOM_NUMBER));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getRandomCircle(Color randomColor) {
        double radius = random.nextDouble();
        return new Circle(randomColor, radius);
    }

    private Figure getRandomIsoscelesTrapezoid(Color randomColor) {
        double firstSide = random.nextDouble();
        double secondSide = random.nextDouble();
        double height = random.nextDouble();
        return new IsoscelesTrapezoid(randomColor, firstSide, secondSide, height);
    }

    private Figure getRandomRectangle(Color randomColor) {
        double width = random.nextDouble();
        double heigth = random.nextDouble();
        return new Rectangle(randomColor, width, heigth);
    }

    private Figure getRandomRightTriangle(Color randomColor) {
       double side = random.nextDouble();
       return new RightTriangle(randomColor, side);
    }

    private Figure getRandomSquare(Color randomColor) {
        double side = random.nextDouble();
        return new Square(randomColor, side);
    }
}
