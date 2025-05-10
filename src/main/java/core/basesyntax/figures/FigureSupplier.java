package core.basesyntax.figures;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int MAX_SIZE = 30;
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADUIS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureType randomFigureType = FigureType.values()[random.nextInt(FIGURES_COUNT)];

        switch (randomFigureType) {
            case RECTANGLE :
                return new Rectangle(getRandomSize(), getRandomSize(),
                        colorSupplier.getRandomColor());
            case RIGHT_TRIANGLE:
                return new RightTriangle(getRandomSize(), getRandomSize(),
                        colorSupplier.getRandomColor());
            case CIRCLE:
                return new Circle(getRandomSize(), colorSupplier.getRandomColor());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(getRandomSize(), getRandomSize(),
                        getRandomSize(), colorSupplier.getRandomColor());
            case SQUARE:
                return new Square(getRandomSize(), colorSupplier.getRandomColor());
            default:
                return new FigureSupplier().getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADUIS, DEFAULT_COLOR);
    }

    private double getRandomSize() {
        return random.nextInt(MAX_SIZE);
    }
}
