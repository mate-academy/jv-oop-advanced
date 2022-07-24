package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DefaultCircleRadius = 10;
    private static final int LimitValue = 20;
    private static final int AmountOfFigures = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int numberOfFigures = new Random().nextInt(AmountOfFigures);
        return numberOfFigures == 1
                ? new Circle(colorSupplier.getRandomColor(), random.nextInt(LimitValue))
                : numberOfFigures == 2
                ? new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(LimitValue),
                random.nextInt(LimitValue), random.nextInt(LimitValue))
                : numberOfFigures == 3
                ? new Rectangle(colorSupplier.getRandomColor(), random.nextInt(LimitValue),
                random.nextInt(LimitValue))
                : numberOfFigures == 4
                ? new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(LimitValue))
                : new Square(colorSupplier.getRandomColor(), random.nextInt(LimitValue));

    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DefaultCircleRadius);
    }
}
