package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int MAX_VALUE = 10;
    private static final int DEFAULT_FIGURE_VALUE = 10;

    public Figure getRandomFigure() {
        final int randomSize = random.nextInt(MAX_VALUE) + 1;
        FigureType[] figures = FigureType.values();

        switch (figures[random.nextInt(figures.length)]) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), randomSize);
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomSize, randomSize, randomSize);
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        randomSize, randomSize);
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        randomSize, randomSize);
            default:
                return new Square(colorSupplier.getRandomColor(), randomSize);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_FIGURE_VALUE);
    }
}
