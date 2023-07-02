package core.basesyntax.servise;

import core.basesyntax.constants.FigureName;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {

    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 30;
    private static final int DEFAULT_SIZE = 10;
    private static final int FIGURE_COUNT = FigureName.values().length;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private int getRandomValue() {
        return MIN_SIZE + random.nextInt(MAX_SIZE - MIN_SIZE);
    }

    public Figure getRandomFigure() {
        int indexOfFigure = random.nextInt(FIGURE_COUNT);
        switch (indexOfFigure) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        getRandomValue());

            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue());

            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue());

            case 3:
                return new Square(colorSupplier.getRandomColor(),
                        getRandomValue());

            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue(), getRandomValue());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", DEFAULT_SIZE);
    }

}
