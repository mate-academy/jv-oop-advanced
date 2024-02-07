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
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_DEMENSION = 10;
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0:
                return new Circle(color.getRandomColor(),
                        random.nextDouble() * MAX_DEMENSION);
            case 1:
                return new Square(color.getRandomColor(),
                        (int) (random.nextDouble() * MAX_DEMENSION));
            case 2:
                return new RightTriangle(color.getRandomColor(),
                        (int) (random.nextDouble() * MAX_DEMENSION),
                        random.nextInt() * MAX_DEMENSION);
            case 3:
                return new IsoscelesTrapezoid(color.getRandomColor(),
                        (int) (random.nextDouble() * MAX_DEMENSION),
                        (int) (random.nextDouble() * MAX_DEMENSION),
                        (int) (random.nextDouble() * MAX_DEMENSION));
            default:
                return new Rectangle(color.getRandomColor(),
                        (int) (random.nextDouble() * MAX_DEMENSION),
                        (int) (random.nextDouble() * MAX_DEMENSION));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
