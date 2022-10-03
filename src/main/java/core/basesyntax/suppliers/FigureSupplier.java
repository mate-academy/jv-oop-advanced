package core.basesyntax.suppliers;

import core.basesyntax.Color;
import core.basesyntax.Figure;
import core.basesyntax.ImplementedFigure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_MULTIPLIER = 50;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final Random figureRandom = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Color randomColor = colorSupplier.getRandomColor();
        double randomDouble1 = getRandomDoubleValue();
        double randomDouble2 = getRandomDoubleValue();

        ImplementedFigure[] figures = ImplementedFigure.values();
        ImplementedFigure randomFigure = figures[figureRandom.nextInt(figures.length)];

        switch (randomFigure) {
            case CIRCLE:
                return new Circle(randomColor, randomDouble1);
            case RIGHT_TRIANGLE:
                return new RightTriangle(randomColor, randomDouble1, randomDouble2);
            case SQUARE:
                return new Square(randomColor, randomDouble1);
            case RECTANGLE:
                return new Rectangle(randomColor, randomDouble1, randomDouble2);
            case ISOSCELES_TRAPEZOID:
                double height = getRandomDoubleValue();
                return new IsoscelesTrapezoid(randomColor, randomDouble1, randomDouble2, height);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_CIRCLE_RADIUS);
    }

    private double getRandomDoubleValue() {
        return random.nextDouble() * (random.nextInt(MAX_RANDOM_MULTIPLIER) + 1);
    }
}

