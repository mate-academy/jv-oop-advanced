package core.basesyntax.services;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {

    private static final int FIGURE_COUNT = 5;
    private static final int MAX_PARAM_VALUE = 20;

    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new Circle(getRandomNumber());
            case 1:
                return new IsoscelesTrapezoid(getRandomNumber(),
                        getRandomNumber(),
                        getRandomNumber());
            case 2:
                return new RightTriangle(getRandomNumber(),
                        getRandomNumber());
            case 3:
                return new Square(getRandomNumber());
            default:
                return new Rectangle(getRandomNumber(),
                        getRandomNumber());
        }
    }

    private int getRandomNumber() {
        return new Random().nextInt(MAX_PARAM_VALUE);
    }
}
