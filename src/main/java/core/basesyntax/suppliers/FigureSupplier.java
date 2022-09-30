package core.basesyntax.suppliers;

import core.basesyntax.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_MULTIPLIER = 50;
    private static final int FIGURES_COUNT = 5;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private final Random random = new Random();
    private final Random figureRandom = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        double randomDouble1 = getRandomDoubleValue();
        double randomDouble2 = getRandomDoubleValue();

        switch (figureRandom.nextInt(FIGURES_COUNT - 1)) {
            case 0:
                return new Circle(randomColor, randomDouble1);
            case 1:
                return new RightTriangle(randomColor, randomDouble1, randomDouble2);
            case 2:
                return new Square(randomColor, randomDouble1);
            case 3:
                return new Rectangle(randomColor, randomDouble1, randomDouble2);
            default:
                double height = getRandomDoubleValue();
                return new IsoscelesTrapezoid(randomColor, randomDouble1, randomDouble2, height);
        }
    }

    private double getRandomDoubleValue() {
        return random.nextDouble() * (random.nextInt(MAX_RANDOM_MULTIPLIER) + 1);
    }

    public static Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS);
    }
}

