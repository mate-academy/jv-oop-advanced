package core.basesyntax;

import java.util.Random;

public final class FigureSupplier {
    private static final double DIMENSION_LIMIT = 100.0;
    private static final double DEFAULT_RADIUS = 10;
    private static final int FIGURE_TYPE_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private int figureIndex;

    public Figure getRandomFigure() {
        figureIndex = random.nextInt(FIGURE_TYPE_COUNT) + 1;
        switch (figureIndex) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(), getRandomDimension());
            case 2:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        getRandomDimension(),
                        getRandomDimension(),
                        getRandomDimension());

                while (isoscelesTrapezoid.getBottomSide() <= isoscelesTrapezoid.getTopSide()) {
                    isoscelesTrapezoid.setBottomSide(getRandomDimension());
                }

                return isoscelesTrapezoid;
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                                     getRandomDimension(),
                                     getRandomDimension());
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                                         getRandomDimension(),
                                         getRandomDimension());
            case 5:
                return new Square(colorSupplier.getRandomColor(), getRandomDimension());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_RADIUS);
    }

    private double getRandomDimension() {
        return random.nextDouble() * DIMENSION_LIMIT;
    }
}
