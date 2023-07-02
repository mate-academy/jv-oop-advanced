package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.models.Circle;
import core.basesyntax.models.Figure;
import core.basesyntax.models.IsoscelesTrapezoid;
import core.basesyntax.models.Rectangle;
import core.basesyntax.models.RightTriangle;
import core.basesyntax.models.Square;
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
        int index = random.nextInt(THE_NUMBER_OF_FIGURES - 1);
        switch (index) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomSize());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomSize(), getRandomSize(), getRandomSize());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomSize(), getRandomSize());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomSize(), getRandomSize());
            case 4:
                return new Square(colorSupplier.getRandomColor(), getRandomSize());
            default:
                throw new IllegalArgumentException("Illegal figures");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, RADIUS);
    }

    private double getRandomSize() {
        return MINIMUM_SIZE + random.nextInt(MAXIMUM_SIZE);
    }
}
