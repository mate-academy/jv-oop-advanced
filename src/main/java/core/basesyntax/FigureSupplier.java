package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURES = 5;
    public static final int MAX_VALUE = 10;
    public static final int DEFAULT_RADIUS = 5;
    public static final Color DEFAULT_COLOR = Color.WHITE;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private Square createRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE));
    }

    private Rectangle createRandomRectangle() {
        return new Rectangle(random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE),
                colorSupplier.getRandomColor());
    }

    private RightTriangle createRandomRightTriangle() {
        return new RightTriangle(random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE),
                colorSupplier.getRandomColor());
    }

    private Circle createRandomCircle() {
        return new Circle(random.nextInt(MAX_VALUE),
                colorSupplier.getRandomColor());
    }

    private IsoscelesTrapezoid createRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE),
                random.nextInt(),
                colorSupplier.getRandomColor());
    }

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURES);

        switch (figureType) {
            case 0:
                return createRandomSquare();
            case 1:
                return createRandomRectangle();
            case 2:
                return createRandomRightTriangle();
            case 3:
                return createRandomCircle();
            case 4:
                return createRandomIsoscelesTrapezoid();
            default:
                throw new IllegalArgumentException("Invalid figure type");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
