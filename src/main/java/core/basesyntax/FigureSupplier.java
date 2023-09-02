package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RADIUS_CIRCLE = 10;
    private static final String WHITE_COLOR = Color.WHITE.name().toLowerCase();
    private static Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    //private utility method
    private static int getNumberFrom1to100() {
        return random.nextInt(101);
    }

    public FigureAbstract getDefaultFigure() {
        return new Circle(WHITE_COLOR, RADIUS_CIRCLE);
    }

    public FigureAbstract getRandomFigure() {
        FigureType[] figures = FigureType.values();
        int index = random.nextInt(figures.length);
        FigureType figureType = figures[index];

        switch (figureType) {
            case SQUARE:
                return new Square(
                        colorSupplier.getRandomColor().toLowerCase(),
                        getNumberFrom1to100()
                );
            case CIRCLE:
                return new Circle(
                        colorSupplier.getRandomColor().toLowerCase(),
                        getNumberFrom1to100()
                );
            case RECTANGLE:
                return new Rectangle(
                        colorSupplier.getRandomColor().toLowerCase(),
                        getNumberFrom1to100(),
                        getNumberFrom1to100()
                );
            case RIGHTTRIANGLE:
                return new RightTriangle(
                        colorSupplier.getRandomColor().toLowerCase(),
                        getNumberFrom1to100(),
                        getNumberFrom1to100()

                );
            case ISOSCELESTRAPEZOID:
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor().toLowerCase(),
                        getNumberFrom1to100(),
                        getNumberFrom1to100(),
                        getNumberFrom1to100()
                );
            default:
                return getDefaultFigure();
        }
    }
}
