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
    public static final double BOUND_OF_SIZE = 100;
    public static final double DEFAULT_CIRCLE_RADIUS = 10;
    public static final Color DEFAULT_CIRCLE_COLOR = Color.WHITE;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomizer = random.nextInt(Shapes.values().length) + 1;
        switch (randomizer) {
            case 1: return new Circle(
                    random.nextDouble(BOUND_OF_SIZE),
                    ColorSupplier.getRandomColor());
            case 2: return new Square(
                    random.nextDouble(BOUND_OF_SIZE),
                    ColorSupplier.getRandomColor());
            case 3: return new Rectangle(
                    random.nextDouble(BOUND_OF_SIZE),
                    random.nextDouble(BOUND_OF_SIZE),
                    ColorSupplier.getRandomColor());
            case 4: return new RightTriangle(
                    random.nextDouble(BOUND_OF_SIZE),
                    random.nextDouble(BOUND_OF_SIZE),
                    ColorSupplier.getRandomColor());
            case 5: return new IsoscelesTrapezoid(
                    random.nextDouble(BOUND_OF_SIZE),
                    random.nextDouble(BOUND_OF_SIZE),
                    random.nextDouble(BOUND_OF_SIZE),
                    ColorSupplier.getRandomColor());
            default: return new Circle(DEFAULT_CIRCLE_RADIUS, DEFAULT_CIRCLE_COLOR);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, DEFAULT_CIRCLE_COLOR);
    }
}
