package core.basesyntax.supplier;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_VALUE = 30;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int MAX_RANDOUM_BOUND = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(MAX_RANDOUM_BOUND);
        String color = colorSupplier.getRandomColor();;
        double sideA;
        double sideB;

        switch (randomIndex) {
            case 0:
                double radius = random.nextInt(MAX_RANDOM_VALUE);
                return new Circle(color, radius);
            case 1:
                double side = random.nextInt(MAX_RANDOM_VALUE);
                return new Square(color, side);
            case 2:
                sideA = random.nextInt(MAX_RANDOM_VALUE);
                sideB = random.nextInt(MAX_RANDOM_VALUE);
                return new Rectangle(color, sideA, sideB);
            case 3:
                sideA = random.nextInt(MAX_RANDOM_VALUE);
                sideB = sideA;
                return new RightTriangle(color, sideA, sideB);
            default:
                sideA = random.nextInt(MAX_RANDOM_VALUE);
                sideB = random.nextInt(MAX_RANDOM_VALUE);
                double trapezoidHeight = random.nextInt(MAX_RANDOM_VALUE);
                return new IsoscelesTrapezoid(color, sideA, sideB, trapezoidHeight);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_CIRCLE_RADIUS);
    }
}
