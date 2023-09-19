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

    public Figure getRandomFigure() {
        final int maxValue = 10;
        final int randomSize = random.nextInt(maxValue) + 1;
        Figures[] figures = Figures.values();

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
        return new Circle(Colors.WHITE.name(), 10);
    }
}
