package core.basesyntax.supplier;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_AMOUNT = 5;
    private static final int CONSTANT_RADIUS = 10;
    private static final int MAX_RANDOM = 50;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public final Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_AMOUNT)) {
            case 0:
                return new Circle(getRandomInt(), colorSupplier.getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomDouble(),
                getRandomDouble(),
                getRandomDouble());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                getRandomDouble(),
                getRandomDouble());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomDouble(),
                getRandomDouble());
            case 4:
                return new Square(colorSupplier.getRandomColor(), getRandomDouble());
            default:
                return getDefaultFigure();
        }
    }

    private int getRandomInt() {
        return random.nextInt(MAX_RANDOM);
    }

    private double getRandomDouble() {
        return random.nextDouble();
    }

    private Figure getDefaultFigure() {
        return new Circle(CONSTANT_RADIUS, Color.WHITE.name());
    }
}
