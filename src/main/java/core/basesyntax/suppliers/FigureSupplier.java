package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final double MAX_UNIT = 20;
    private static final String DEFAULT_CIRCLE_COLOR = "WHITE";
    private static final int DEFAULT_CIRCLE_RADIUS = 10;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public double getRandomUnit() {
        return random.nextDouble() * MAX_UNIT;
    }

    public Figure getRandomFigure() {
        final int figureIndex = random.nextInt(NUMBER_OF_FIGURES);
        final String randomColor = colorSupplier.getRandomColor();

        switch (figureIndex) {
            case 0: {
                return new Square(randomColor, getRandomUnit());
            }
            case 1: {
                return new Rectangle(randomColor, getRandomUnit(), getRandomUnit());
            }
            case 2: {
                return new RightTriangle(randomColor, getRandomUnit(), getRandomUnit());
            }
            case 3: {
                return new Circle(randomColor, getRandomUnit());
            }
            case 4: {
                return new IsoscelesTrapezoid(randomColor,
                        getRandomUnit(),
                        getRandomUnit(),
                        getRandomUnit());
            }
            default: {
                return getDefaultFigure();
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }
}
