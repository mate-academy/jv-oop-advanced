package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int FIGURE_AMOUNT = 5;
    static final int FIGURE_PARAMETERS_MAX = 20;
    static final Color DEFAULT_COLOR = Color.WHITE;
    static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigureNumber = random.nextInt(FIGURE_AMOUNT + 1);
        int randomFigureParameter = random.nextInt(FIGURE_PARAMETERS_MAX + 1);
        switch (randomFigureNumber) {
            case 0: {
                return new Circle(colorSupplier.getRandomColor(), randomFigureParameter);
            }
            case 1: {
                return new Square(colorSupplier.getRandomColor(), randomFigureParameter);
            }
            case 2: {
                return new Rectangle(colorSupplier.getRandomColor(),
                        randomFigureParameter, randomFigureParameter);
            }
            case 3: {
                return new RightTriangle(colorSupplier.getRandomColor(),
                        randomFigureParameter, randomFigureParameter);
            }
            default: {
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomFigureParameter, randomFigureParameter);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
