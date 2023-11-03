package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final int MAX_RANDOM_VALUE = 100;
    public static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        FigureList figureName = FigureList.values()[figureNumber];
        Figure figure;
        switch (figureName) {
            case CIRCLE -> figure = createRandomCircle();
            case RECTANGLE -> figure = createRandomRectangle();
            case ISOSCELES_TRAPEZOID -> figure = createRandomIsoscelesTrapezoid();
            case SQUARE -> figure = createRandomSquare();
            case RIGHT_TRIANGLE -> figure = createRandomRightTriangle();
            default -> figure = null;
        }
        return figure;
    }

    private RightTriangle createRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE));
    }

    private Square createRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_VALUE));
    }

    private IsoscelesTrapezoid createRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE));
    }

    private Rectangle createRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE));
    }

    private Circle createRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_VALUE));
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_RADIUS);
    }
}
