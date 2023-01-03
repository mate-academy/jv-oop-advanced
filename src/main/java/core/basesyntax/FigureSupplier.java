package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURES = 5;
    public static final int NEXT_INT_BOUND = 10;
    public static final int DEFAULT_RADIUS = 10;
    public static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final String randomColor = colorSupplier.getRandomColor();
    private final int randomValueX = random.nextInt(NEXT_INT_BOUND) + 1;
    private final int randomValueY = random.nextInt(NEXT_INT_BOUND) + 1;
    private final int randomValueZ = random.nextInt(NEXT_INT_BOUND) + 1;

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURES);

        switch (index) {
            case 0:
                return getCircle();
            case 1:
                return getIsoscelesTrapezoid();
            case 2:
                return getRectangle();
            case 3:
                return getRightTriangle();
            default:
                return getSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.name().toLowerCase(), DEFAULT_RADIUS);
    }

    private Figure getCircle() {
        return new Circle(randomColor, randomValueX);
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(randomColor, randomValueX, randomValueY,
                randomValueZ);
    }

    private Figure getRectangle() {
        return new Rectangle(randomColor, randomValueX, randomValueY);
    }

    private Figure getRightTriangle() {
        return new RightTriangle(randomColor, randomValueX, randomValueY);
    }

    private Figure getSquare() {
        return new Square(randomColor, randomValueX);
    }
}
