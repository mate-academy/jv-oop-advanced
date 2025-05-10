package core.basesyntax.suppliers;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int RANDOM_BOUND = 50;
    private static final int CIRCLE_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURES);
        return switch (index) {
            case 0 -> new Circle(colorSupplier.getRandomColor(), getRandomInt());
            case 1 -> new Rectangle(colorSupplier.getRandomColor(), getRandomDouble(),
                    getRandomDouble());
            case 2 -> new RightTriangle(colorSupplier.getRandomColor(),
                    getRandomInt(), getRandomInt());
            case 3 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    getRandomDouble(), getRandomDouble(), getRandomDouble());
            default -> new Square(colorSupplier.getRandomColor(), getRandomInt());
        };
    }

    private int getRandomInt() {
        return random.nextInt(RANDOM_BOUND);
    }

    private double getRandomDouble() {
        return random.nextDouble();
    }

    public Figure getDefaultFigure() {
        return new Circle("white", CIRCLE_RADIUS);
    }
}
