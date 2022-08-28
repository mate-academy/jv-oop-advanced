package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_MAX_SIZE = 10;
    private static final int FIGURE_MAX_PARAMETERS_COUNT = 3;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    Figure getRandomFigure() {
        int[] figureParameters = new int[FIGURE_MAX_PARAMETERS_COUNT];
        for (int i = 0; i < FIGURE_MAX_PARAMETERS_COUNT; i++) {
            figureParameters[i] = random.nextInt(FIGURE_MAX_SIZE) + 1;
        }
        String figureColorRandom = colorSupplier.getRandomColor();
        FigureTypeName figureTypeRandom = FigureTypeName
                .values()[random.nextInt(FigureTypeName.values().length)];
        switch (figureTypeRandom) {
            case circle:
                return new Circle(figureColorRandom,
                        figureParameters[0]);
            case isoscelesTrapezoid:
                return new IsoscelesTrapezoid(figureColorRandom,
                        figureParameters[0],
                        figureParameters[1],
                        figureParameters[2]);
            case rectangle:
                return new Rectangle(figureColorRandom,
                        figureParameters[0],
                        figureParameters[1]);
            case rightTriangle:
                return new RightTriangle(figureColorRandom,
                        figureParameters[0],
                        figureParameters[1]);
            case square:
                return new Square(figureColorRandom,
                        figureParameters[0]);
            default:
                return getDefaultFigure();
        }
    }

    Figure getDefaultFigure() {
        return new Circle(Color.white.toString(), 10);
    }
}
