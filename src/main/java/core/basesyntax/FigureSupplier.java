package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final int RANDOM_FIGURE_CHOOSE = 5;
    private static final int MAX_RANDOM_NUMBER = 20;
    private static final int CIRCLE_DEFAULT_RADIUS = 10;
    private static final String CIRCLE_DEFAULT_COLOR = Color.WHITE.name();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigureSelection = random.nextInt(RANDOM_FIGURE_CHOOSE);
        switch (randomFigureSelection) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_DEFAULT_COLOR, CIRCLE_DEFAULT_RADIUS);
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                   random.nextInt(MAX_RANDOM_NUMBER));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                   random.nextInt(MAX_RANDOM_NUMBER),
                   random.nextInt(MAX_RANDOM_NUMBER));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                   random.nextInt(MAX_RANDOM_NUMBER));
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                   random.nextInt(MAX_RANDOM_NUMBER));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                   random.nextInt(MAX_RANDOM_NUMBER),
                   random.nextInt(MAX_RANDOM_NUMBER),
                   random.nextInt(MAX_RANDOM_NUMBER));
    }
}
