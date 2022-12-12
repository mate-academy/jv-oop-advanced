package core.basesyntax.suppliers;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_INTEGER_RANDOM_VALUE = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(4);
        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomInt());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomDouble(), getRandomDouble(), getRandomDouble());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomInt(),
                        getRandomInt());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomInt(),
                        getRandomInt());
            default:
                return new Square(colorSupplier.getRandomColor(), getRandomInt());
        }
    }

    private int getRandomInt() {
        return random.nextInt(MAX_INTEGER_RANDOM_VALUE);
    }

    private double getRandomDouble() {
        return random.nextDouble();
    }
}
