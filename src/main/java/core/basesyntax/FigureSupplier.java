package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER_OF_FIGURES = 5;
    private static final double MAX_SIZE = 100d;
    private static final double DEFAULT_RADIUS_OF_CIRCLE = 10d;
    private static final String DEFAULT_COLOR = "white";

    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {

        switch (random.nextInt(MAX_NUMBER_OF_FIGURES)) {
            case 0 :
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextDouble() * MAX_SIZE);
            case 1 :
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble() * MAX_SIZE,
                        random.nextDouble() * MAX_SIZE,
                        random.nextDouble() * MAX_SIZE);
            case 2 :
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * MAX_SIZE,
                        random.nextDouble() * MAX_SIZE);
            case 3 :
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * MAX_SIZE,
                        random.nextDouble() * MAX_SIZE);
            default :
                return new Square(colorSupplier.getRandomColor(),
                        random.nextDouble() * MAX_SIZE);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS_OF_CIRCLE);
    }
}
