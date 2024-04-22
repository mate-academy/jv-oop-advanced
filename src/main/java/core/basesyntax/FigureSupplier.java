package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_SUBTYPES = 5;
    private static final int CIRCLE_RADIUS = 10;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureChoice = random.nextInt(FIGURE_SUBTYPES);
        switch (figureChoice) {
            case 0 :
                return new Circle(
                        DimensionSupplier.getRandomDimension(),
                        colorSupplier.getRandomColor()
                );
            case 1 :
                return new Rectangle(
                        DimensionSupplier.getRandomDimension(),
                        DimensionSupplier.getRandomDimension(),
                        colorSupplier.getRandomColor()
                );
            case 2 :
                return new Square(
                        DimensionSupplier.getRandomDimension(),
                        colorSupplier.getRandomColor()
                );
            case 3 :
                return new RightTriangle(
                        DimensionSupplier.getRandomDimension(),
                        DimensionSupplier.getRandomDimension(),
                        colorSupplier.getRandomColor()
                );
            case 4 :
                return new IsoscelesTrapezoid(
                        DimensionSupplier.getRandomDimension(),
                        DimensionSupplier.getRandomDimension(),
                        DimensionSupplier.getRandomDimension(),
                        colorSupplier.getRandomColor()
                );
            default :
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_RADIUS, Color.WHITE);
    }
}
