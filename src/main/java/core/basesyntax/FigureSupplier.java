package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final double MAX_SIZE = 10.0;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final double DEFAULT_RADIUS = 10.0;
    private static final int MAX_COUNT = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    String randomColor = colorSupplier.getRandomColor();
    double sizePartFigure = RANDOM.nextDouble() * MAX_SIZE;

    public Figure getRandomFigure() {
        int figureType = RANDOM.nextInt(MAX_COUNT);

        switch (figureType) {
            case 0:
                return new Square(randomColor, sizePartFigure);
            case 1:
                return new Rectangle(randomColor, sizePartFigure, sizePartFigure);
            case 2:
                return new RightTriangle(randomColor, sizePartFigure, sizePartFigure);
            case 3:
                return new Circle(randomColor, sizePartFigure);
            case 4:
                return new IsoscelesTrapezoid(randomColor,
                        sizePartFigure,
                        sizePartFigure,
                        sizePartFigure);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
