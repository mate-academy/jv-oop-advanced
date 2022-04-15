package core.basesyntax.supplier;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 30;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(FigureType.values().length);
        String color;
        double sideA;
        double sideB;

        switch (randomIndex) {
            case 0:
                color = colorSupplier.getRandomColor();
                double radius = random.nextInt(MAX_VALUE);
                return new Circle(color, radius);
            case 1:
                color = colorSupplier.getRandomColor();
                double side = random.nextInt(MAX_VALUE);
                return new Square(color, side);
            case 2:
                color = colorSupplier.getRandomColor();
                sideA = random.nextInt(MAX_VALUE);
                sideB = random.nextInt(MAX_VALUE);
                return new Rectangle(color, sideA, sideB);
            case 3:
                color = colorSupplier.getRandomColor();
                sideA = random.nextInt(MAX_VALUE);
                sideB = sideA;
                return new RightTriangle(color, sideA, sideB);
            default:
                color = colorSupplier.getRandomColor();
                sideA = random.nextInt(MAX_VALUE);
                sideB = random.nextInt(MAX_VALUE);
                double trapezoidHeight = random.nextInt(MAX_VALUE);
                return new IsoscelesTrapezoid(color, sideA, sideB, trapezoidHeight);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
