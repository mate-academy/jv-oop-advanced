package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_AMOUNT = 5;
    private static final int FIGURE_PARAMETERS_MAX = 20;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomFigureNumber = random.nextInt(FIGURE_AMOUNT + 1);
        int randomFigureParameter = random.nextInt(FIGURE_PARAMETERS_MAX + 1);
        int randomFigureHeight = random.nextInt(FIGURE_PARAMETERS_MAX + 1);
        int randomTrapezoidBase = random.nextInt(FIGURE_PARAMETERS_MAX + 1);
        switch (randomFigureNumber) {
            case 0: {
                return new Circle(randomColor, randomFigureParameter);
            }
            case 1: {
                return new Square(randomColor, randomFigureParameter);
            }
            case 2: {
                return new Rectangle(randomColor,randomFigureHeight,
                        randomFigureParameter);
            }
            case 3: {
                return new RightTriangle(randomColor,
                        randomFigureParameter, randomFigureHeight);
            }
            default: {
                return new IsoscelesTrapezoid(randomColor,
                        randomTrapezoidBase, randomFigureParameter, randomFigureHeight);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
