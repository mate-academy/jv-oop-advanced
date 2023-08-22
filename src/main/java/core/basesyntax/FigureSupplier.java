package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_BOUND = 6;
    private static final int DEFAULT_SIZE = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private static final FigureSupplier figureSupplier = new FigureSupplier();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int indexOfColor = random.nextInt(NUMBER_OF_BOUND);
        Figure randomFigure;
        switch (indexOfColor) {
            case 1: {
                randomFigure = createRandomSquare(colorSupplier);
                break;
            }
            case 2: {
                randomFigure = createRandomRectangle(colorSupplier);
                break;
            }
            case 3: {
                randomFigure = createRandomRightTriangle(colorSupplier);
                break;
            }
            case 4: {
                randomFigure = createRandomCircle(colorSupplier);
                break;
            }
            case 5: {
                randomFigure = createRandomIsoscelesTrapezoid(colorSupplier);
                break;
            }
            default: {
                return figureSupplier.getDefaultFigure();
            }
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_SIZE, DEFAULT_COLOR);
    }

    private Square createRandomSquare(ColorSupplier colorSupplier) {
        return new Square(random.nextDouble() * DEFAULT_SIZE + 1,
                colorSupplier.getRandomColor());
    }

    private Rectangle createRandomRectangle(ColorSupplier colorSupplier) {
        return new Rectangle(random.nextDouble() * DEFAULT_SIZE + 1,
                random.nextDouble() * DEFAULT_SIZE + 1,
                colorSupplier.getRandomColor());
    }

    private RightTriangle createRandomRightTriangle(ColorSupplier colorSupplier) {
        return new RightTriangle(random.nextDouble() * DEFAULT_SIZE + 1,
                random.nextDouble() * DEFAULT_SIZE + 1,
                colorSupplier.getRandomColor());
    }

    private Circle createRandomCircle(ColorSupplier colorSupplier) {
        return new Circle(random.nextDouble() * DEFAULT_SIZE + 1,
                colorSupplier.getRandomColor());
    }

    private IsoscelesTrapezoid createRandomIsoscelesTrapezoid(ColorSupplier colorSupplier) {
        return new IsoscelesTrapezoid(random.nextDouble() * DEFAULT_SIZE + 1,
                random.nextDouble() * DEFAULT_SIZE + 1,
                random.nextDouble() * DEFAULT_SIZE + 1,
                colorSupplier.getRandomColor());
    }
}
