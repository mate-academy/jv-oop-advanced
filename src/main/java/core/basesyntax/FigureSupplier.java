package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final Color DEFAULT_COLOR = AbstractFigure.getDefaultColor();

    private final Random random = new Random();

    public core.basesyntax.Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        return switch (figureNumber) {
            case 0 -> createRandomCircle();
            case 1 -> createRandomRectangle();
            case 2 -> createRandomRightTriangle();
            case 3 -> createRandomSquare();
            case 4 -> createRandomIsoscelesTrapezoid();
            default -> throw new IllegalStateException("Unexpected value: " + figureNumber);
        };
    }

    public core.basesyntax.Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR) {
            @Override
            public Color getColor() {
                return null;
            }
        };
    }

    private Circle createRandomCircle() {
        return new Circle(generateRandomSize(), AbstractFigure.getRandomColor()) {
            @Override
            public Color getColor() {
                return null;
            }
        };
    }

    private Rectangle createRandomRectangle() {
        return new Rectangle(generateRandomSize(), generateRandomSize(),
                AbstractFigure.getRandomColor()) {
            @Override
            public Color getColor() {
                return null;
            }
        };
    }

    private RightTriangle createRandomRightTriangle() {
        return new RightTriangle(generateRandomSize(), generateRandomSize(),
                AbstractFigure.getRandomColor()) {
            @Override
            public Color getColor() {
                return null;
            }
        };
    }

    private Square createRandomSquare() {
        return new Square(generateRandomSize(),
                AbstractFigure.getRandomColor());
    }

    private IsoscelesTrapezoid createRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                generateRandomSize(),
                generateRandomSize(),
                generateRandomSize(),
                AbstractFigure.getRandomColor()) {
            @Override
            public Color getColor() {
                return null;
            }
        };
    }

    private double generateRandomSize() {
        return random.nextDouble() * 10 + 1;
    }
}
