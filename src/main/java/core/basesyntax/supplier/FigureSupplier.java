package core.basesyntax.supplier;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_NUMBER = 5;
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 5;

    private static final String DEFAULT_COLOR = "WHITE";
    private static final double DEFAULT_RADIUS = 10.0;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURES_NUMBER);
        return switch (index) {
            case 0 -> new Circle(colorSupplier.getRandomColor(),
                    random.nextInt(MIN_RANDOM_NUMBER,MAX_RANDOM_NUMBER));
            case 1 -> new Rectangle(colorSupplier.getRandomColor(),
                    random.nextInt(MIN_RANDOM_NUMBER,MAX_RANDOM_NUMBER),
                    random.nextInt(MIN_RANDOM_NUMBER,MAX_RANDOM_NUMBER));
            case 2 -> new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextInt(MIN_RANDOM_NUMBER,MAX_RANDOM_NUMBER),
                    random.nextInt(MIN_RANDOM_NUMBER,MAX_RANDOM_NUMBER));
            case 3 -> new Square(colorSupplier.getRandomColor(),
                    random.nextInt(MIN_RANDOM_NUMBER,MAX_RANDOM_NUMBER));
            default -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextInt(MIN_RANDOM_NUMBER,MAX_RANDOM_NUMBER),
                    random.nextInt(MIN_RANDOM_NUMBER,MAX_RANDOM_NUMBER),
                    random.nextInt(MIN_RANDOM_NUMBER,MAX_RANDOM_NUMBER));
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR,DEFAULT_RADIUS);
    }
}
