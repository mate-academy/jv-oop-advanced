package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final double MAX_SIZE = 10.0;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final double DEFAULT_RADIUS = 10.0;
    private static final int MAX_COUNT = 5;

    private String generateRandomColor() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return colorSupplier.getRandomColor();
    }

    private double generateSizePartFigure() {
        return RANDOM.nextDouble() * MAX_SIZE;
    }

    public Figure getRandomFigure() {
        switch (RANDOM.nextInt(MAX_COUNT)) {
            case 0:
                return new Square(generateRandomColor(), generateSizePartFigure());
            case 1:
                return new Rectangle(generateRandomColor(),
                        generateSizePartFigure(),
                        generateSizePartFigure());
            case 2:
                return new RightTriangle(generateRandomColor(),
                        generateSizePartFigure(),
                        generateSizePartFigure());
            case 3:
                return new Circle(generateRandomColor(), generateSizePartFigure());
            case 4:
                return new IsoscelesTrapezoid(generateRandomColor(),
                        generateSizePartFigure(),
                        generateSizePartFigure(),
                        generateSizePartFigure());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
