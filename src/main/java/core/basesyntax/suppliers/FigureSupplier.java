package core.basesyntax.suppliers;

import core.basesyntax.Color;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {

    private static final int RANDOM_NUMBER_FIGURE_RANGE = 4;
    private static final double RANDOM_BOUND = 100.00;
    private static final double DEFAULT_CIRCLE_VALUE = 10.0;
    private final Random random = new Random();

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        int randomFigureNumber = random.nextInt(RANDOM_NUMBER_FIGURE_RANGE);
        String randomColor = colorSupplier.getRandomColor();
        Figure randomFigure = null;

        switch (randomFigureNumber) {
            case 0:
                randomFigure = new Circle(randomColor, randomSize());
                break;
            case 1:
                randomFigure = new IsoscelesTrapezoid(randomColor, randomSize(),
                                                      randomSize(), randomSize());
                break;
            case 2:
                randomFigure = new Rectangle(randomColor, randomSize(), randomSize());
                break;
            case 3:
                randomFigure = new RightTriangle(randomColor, randomSize(), randomSize());
                break;
            case 4:
                randomFigure = new Square(randomColor, randomSize());
                break;
            default:
                randomFigure = getDefaultFigure();
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), DEFAULT_CIRCLE_VALUE);
    }

    private double randomSize() {
        return random.nextDouble(RANDOM_BOUND);
    }
}
