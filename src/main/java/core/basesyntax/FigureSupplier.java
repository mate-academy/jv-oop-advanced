package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int DEFAULT_LENGTH = 10;

    private Random random = new Random();

    public Figure getRandomFigure() {
        return switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 1 -> new Square(random.nextInt(), getRandomColor());
            case 2 -> new Rectangle(random.nextInt(), random.nextInt(), getRandomColor());
            case 3 -> new RightTriangle(random.nextInt(), random.nextInt(), getRandomColor());
            case 4 -> new Circle(random.nextInt(), getRandomColor());
            default -> new IsoscelesTrapezoid(
                    random.nextInt(), random.nextInt(), random.nextInt(), getRandomColor());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_LENGTH, Color.WHITE.name());
    }
}
