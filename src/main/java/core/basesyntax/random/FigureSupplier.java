package core.basesyntax.random;

import core.basesyntax.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int DIMENSION_LIMIT = 8;
    private static final int DEFAULT_RADIUS = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public int getRandomNumber(int number) {
        return (random.nextInt(number) + 1);
    }

    public Figure getRandomFigure() {
        int figureNumber = getRandomNumber(FIGURE_COUNT);
        Figure figure;
        switch (figureNumber) {
            case 0:
                return new Square(getRandomNumber(DIMENSION_LIMIT), colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(getRandomNumber(DIMENSION_LIMIT),
                        getRandomNumber(DIMENSION_LIMIT), colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(getRandomNumber(DIMENSION_LIMIT),
                        getRandomNumber(DIMENSION_LIMIT), colorSupplier.getRandomColor());
            case 3:
                return new Circle(getRandomNumber(DIMENSION_LIMIT), colorSupplier.getRandomColor());
            default:
                return new IsoscelesTrapezoid(getRandomNumber(DIMENSION_LIMIT),
                        getRandomNumber(DIMENSION_LIMIT),
                        getRandomNumber(DIMENSION_LIMIT), colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, colorSupplier.getDefaultColor());
    }
}