package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE_OF_SIDES = 30;
    private static final int NUMBER_OF_FIGURES = 5;
    private static final String DEFAULT_COLOR = Colors.WHITE.name();
    private static final double DEFAULT_RADIUS = 10.0;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomNumberOfFigure = random.nextInt(NUMBER_OF_FIGURES);
        switch (randomNumberOfFigure) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    private Square getRandomSquare() {
        String randomColor = colorSupplier.getRandomColor();
        int randomSide = random.nextInt(MAX_SIZE_OF_SIDES);
        return new Square(randomColor, randomSide);
    }

    private Rectangle getRandomRectangle() {
        String randomColor = colorSupplier.getRandomColor();
        int randomSide1 = random.nextInt(MAX_SIZE_OF_SIDES);
        int randomSide2 = random.nextInt(MAX_SIZE_OF_SIDES);
        return new Rectangle(randomColor, randomSide1, randomSide2);
    }

    private RightTriangle getRandomRightTriangle() {
        String randomColor = colorSupplier.getRandomColor();
        int randomSide1 = random.nextInt(MAX_SIZE_OF_SIDES);
        int randomSide2 = random.nextInt(MAX_SIZE_OF_SIDES);
        return new RightTriangle(randomColor, randomSide1, randomSide2);
    }

    private Circle getRandomCircle() {
        String randomColor = colorSupplier.getRandomColor();
        int randomRadius = random.nextInt(MAX_SIZE_OF_SIDES);
        return new Circle(randomColor, randomRadius);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        String randomColor = colorSupplier.getRandomColor();
        int randomSide1 = random.nextInt(MAX_SIZE_OF_SIDES);
        int randomSide2 = random.nextInt(MAX_SIZE_OF_SIDES);
        int randomHeight = random.nextInt(MAX_SIZE_OF_SIDES);
        return new IsoscelesTrapezoid(randomColor, randomSide1, randomSide2, randomHeight);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
