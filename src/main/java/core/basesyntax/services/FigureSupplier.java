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
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomNumber());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomNumber(),
                        getRandomNumber(),
                        getRandomNumber());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomNumber(),
                        getRandomNumber());
            case 3:
                return new Square(colorSupplier.getRandomColor(), getRandomNumber());
            default:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomNumber(),
                        getRandomNumber());
        }
    }

    private int getRandomNumber() {
        return new Random().nextInt(MAX_PARAM_VALUE);
    }
}
