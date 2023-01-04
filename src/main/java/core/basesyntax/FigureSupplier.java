package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURES = 5;
    public static final int NEXT_INT_BOUND = 10;
    public static final int DEFAULT_RADIUS = 10;
    public static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURES);
        String randomColor = colorSupplier.getRandomColor();
        int randomValueX = random.nextInt(NEXT_INT_BOUND) + 1;
        int randomValueY = random.nextInt(NEXT_INT_BOUND) + 1;
        int randomValueZ = random.nextInt(NEXT_INT_BOUND) + 1;

        switch (index) {
            case 0:
                return getCircle(randomColor, randomValueX);
            case 1:
                return getIsoscelesTrapezoid(randomColor, randomValueX, randomValueY, randomValueZ);
            case 2:
                return getRectangle(randomColor, randomValueX, randomValueY);
            case 3:
                return getRightTriangle(randomColor, randomValueX, randomValueY);
            default:
                return getSquare(randomColor, randomValueX);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.name().toLowerCase(), DEFAULT_RADIUS);
    }

    private Figure getCircle(String randomColor, int randomValueX) {
        return new Circle(randomColor, randomValueX);
    }

    private Figure getIsoscelesTrapezoid(String randomColor, int randomValueX, int randomValueY,
                                         int randomValueZ) {
        return new IsoscelesTrapezoid(randomColor, randomValueX, randomValueY,
                randomValueZ);
    }

    private Figure getRectangle(String randomColor, int randomValueX, int randomValueY) {
        return new Rectangle(randomColor, randomValueX, randomValueY);
    }

    private Figure getRightTriangle(String randomColor, int randomValueX, int randomValueY) {
        return new RightTriangle(randomColor, randomValueX, randomValueY);
    }

    private Figure getSquare(String randomColor, int randomValueX) {
        return new Square(randomColor, randomValueX);
    }
}
