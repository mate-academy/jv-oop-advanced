package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_FIGURE_COLOR = Color.WHITE.name();
    private static final int DEFAULT_CIRCLE_RADUIS = 10;
    private static final int NUMBER_OF_FIGURE_TYPES = 5;
    private static final int SIDE_SIZE_LIMIT = 101;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int paramsRandomizer1;
    private final int paramsRandomizer2;
    private final String randomColor;

    public FigureSupplier() {
        paramsRandomizer1 = random.nextInt(SIDE_SIZE_LIMIT);
        paramsRandomizer2 = random.nextInt(SIDE_SIZE_LIMIT);
        randomColor = colorSupplier.getRandomColor();
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURE_TYPES)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomIscTrap();
            case 3:
                return getRandomSquare();
            case 4:
                return getRandomRightTriangle();
            default:
                return getDefaultFigure();
        }
    }

    public Circle getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_COLOR, DEFAULT_CIRCLE_RADUIS);
    }

    public Circle getRandomCircle() {
        return new Circle(randomColor, paramsRandomizer1);
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(randomColor, paramsRandomizer1, paramsRandomizer2);
    }

    public Square getRandomSquare() {
        return new Square(randomColor, paramsRandomizer1);
    }

    public IsoscelesTrapezoid getRandomIscTrap() {
        return new IsoscelesTrapezoid(randomColor, paramsRandomizer1,
                paramsRandomizer2, random.nextInt(SIDE_SIZE_LIMIT));
    }

    public RightTriangle getRandomRightTriangle() {
        return new RightTriangle(randomColor, paramsRandomizer1);
    }
}
