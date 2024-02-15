package core.basesyntax.supplier;

import core.basesyntax.Color;
import core.basesyntax.Figure;
import core.basesyntax.Shapes;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final double BOUND_OF_SIZE = 100;
    private static final double DEFAULT_CIRCLE_RADIUS = 10;
    private static final Color DEFAULT_CIRCLE_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomizer = random.nextInt(Shapes.values().length);
        return switch (randomizer) {
            case 0 -> new Circle(
                    random.nextDouble(BOUND_OF_SIZE),
                    colorSupplier.getRandomColor());
            case 1 -> new Square(
                    random.nextDouble(BOUND_OF_SIZE),
                    colorSupplier.getRandomColor());
            case 2 -> new Rectangle(
                    random.nextDouble(BOUND_OF_SIZE),
                    random.nextDouble(BOUND_OF_SIZE),
                    colorSupplier.getRandomColor());
            case 3 -> new RightTriangle(
                    random.nextDouble(BOUND_OF_SIZE),
                    random.nextDouble(BOUND_OF_SIZE),
                    colorSupplier.getRandomColor());
            case 4 -> new IsoscelesTrapezoid(
                    random.nextDouble(BOUND_OF_SIZE),
                    random.nextDouble(BOUND_OF_SIZE),
                    random.nextDouble(BOUND_OF_SIZE),
                    colorSupplier.getRandomColor());
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, DEFAULT_CIRCLE_COLOR);
    }
}
