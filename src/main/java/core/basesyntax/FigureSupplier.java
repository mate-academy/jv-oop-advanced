package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final double RADIUS = 10;
    private static final int THE_NUMBER_OF_FIGURES = 5;
    private static final int MINIMUM_SIZE = 1;
    private static final int MAXIMUM_SIZE = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int number = random.nextInt(THE_NUMBER_OF_FIGURES - 1);
        switch (number) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomSize());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomSize(),
                        getRandomSize(), getRandomSize());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomSize(),
                        getRandomSize());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomSize(), getRandomSize());
            case 4:
                return new Square(colorSupplier.getRandomColor(), getRandomSize());
            default:
                throw new IllegalArgumentException("Figure doesn`t exist");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, RADIUS);
    }

    private double getRandomSize() {
        return MINIMUM_SIZE + random.nextInt(MAXIMUM_SIZE);
    }
}
