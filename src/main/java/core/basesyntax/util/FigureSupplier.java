package core.basesyntax.util;

import core.basesyntax.Color;
import core.basesyntax.Figure;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_RANDOM_NUMBER = 100;

    private static final int DEFAULT_FIGURE_NUMBER = 10;
    private static final Color DEFAULT_FIGURE_COLOR = Color.WHITE;

    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int randomNumber = getRandomNumber(NUMBER_OF_FIGURES);
        switch (randomNumber) {
            case 1:
                return new Square(getRandomNumberForFigure(), getRandomColor());
            case 2:
                return new Rectangle(
                        getRandomNumberForFigure(),
                        getRandomNumberForFigure(),
                        getRandomColor()
                );
            case 3:
                return new RightTriangle(
                        getRandomNumberForFigure(),
                        getRandomNumberForFigure(),
                        getRandomColor()
                );
            case 4:
                return new Circle(getRandomNumberForFigure(), getRandomColor());
            case 5:
                return new IsoscelesTrapezoid(
                        getRandomNumberForFigure(),
                        getRandomNumberForFigure(),
                        getRandomNumberForFigure(),
                        getRandomColor()
                );
            default:
                return getDefaultFigure();
        }
    }

    /**
     * @param to end bound (inclusive)
     * @return a random integer between 1 and to (inclusive)
     */
    private int getRandomNumber(int to) {
        return random.nextInt(to) + 1;
    }

    private int getRandomNumberForFigure() {
        return getRandomNumber(MAX_RANDOM_NUMBER);
    }

    private Color getRandomColor() {
        return Color.valueOf(colorSupplier.getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_NUMBER, DEFAULT_FIGURE_COLOR);
    }
}
