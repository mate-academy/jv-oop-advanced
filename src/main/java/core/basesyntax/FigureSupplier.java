package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final double MIN_SIZE = 1.0;
    public static final double MAX_SIZE = 15.0;
    public static final double DEFAULT_RADIUS = 10.0;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String randomColor = colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 0: {
                final double side = randomSize();
                return new Square(randomColor, side);
            }
            case 1: {
                final double radius = randomSize();
                return new Circle(randomColor, radius);
            }
            case 2: {
                final double width = randomSize();
                final double height = randomSize();
                return new Rectangle(randomColor, width, height);
            }
            case 3: {
                final double firstLeg = randomSize();
                final double secondLeg = randomSize();
                return new RightTriangle(randomColor, firstLeg, secondLeg);
            }
            case 4: {
                final double bottomBase = randomSize();
                final double topBase = randomSize();
                final double height = randomSize();
                return new IsoscelesTrapezoid(randomColor, bottomBase,
                        topBase, height);
            }
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }

    private double randomSize() {
        return random.nextDouble(MIN_SIZE, MAX_SIZE);
    }
}
