package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_SUBTYPES = 5;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    //limit of figure size when generating randomly
    private static final int MIN_DIMENSION = 1;
    private static final int MAX_DIMENSION = 100;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureChoice = random.nextInt(FIGURE_SUBTYPES);
        switch (figureChoice) {
            case 0 :
                return new Circle(
                        getRandomDimension(),
                        colorSupplier.getRandomColor()
                );
            case 1 :
                return new Rectangle(
                        getRandomDimension(),
                        getRandomDimension(),
                        colorSupplier.getRandomColor()
                );
            case 2 :
                return new Square(
                        getRandomDimension(),
                        colorSupplier.getRandomColor()
                );
            case 3 :
                return new RightTriangle(
                        getRandomDimension(),
                        getRandomDimension(),
                        colorSupplier.getRandomColor()
                );
            case 4 :
                return new IsoscelesTrapezoid(
                        getRandomDimension(),
                        getRandomDimension(),
                        getRandomDimension(),
                        colorSupplier.getRandomColor()
                );
            default :
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, Color.WHITE);
    }

    private int getRandomDimension() {
        return random.nextInt(MIN_DIMENSION, MAX_DIMENSION);
    }
}
