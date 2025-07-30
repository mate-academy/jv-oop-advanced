package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random RANDOM = new Random();
    private final int MINIMUM_VALUE = 5;
    private final int RANGE = 10;
    private final FigureType[] figureTypes = FigureType.values();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        int figureTypeIndex = RANDOM.nextInt(figureTypes.length);
        FigureType choice = figureTypes[figureTypeIndex];
        String color = colorSupplier.getRandomColor();

        switch (choice) {
            case SQUARE:
                double side = MINIMUM_VALUE + RANDOM.nextDouble() * RANGE;
                return new Square(color, side);
            case RECTANGLE:
                double width = MINIMUM_VALUE + RANDOM.nextDouble() * RANGE;
                double height = MINIMUM_VALUE + RANDOM.nextDouble() * RANGE;
                return new Rectangle(color, width, height);
            case RIGHT_TRIANGLE:
                double firstLeg = MINIMUM_VALUE + RANDOM.nextDouble() * RANGE;
                double secondLeg = MINIMUM_VALUE + RANDOM.nextDouble() * RANGE;
                return new RightTriangle(color, firstLeg, secondLeg);
            case CIRCLE:
                double radius = MINIMUM_VALUE + RANDOM.nextDouble() * RANGE;
                return new Circle(color, radius);
            case ISOSCELES_TRAPEZOID:
                double base1 = MINIMUM_VALUE + RANDOM.nextDouble() * RANGE;
                double base2 = MINIMUM_VALUE + RANDOM.nextDouble() * RANGE;
                double heightTrapezoid = MINIMUM_VALUE + RANDOM.nextDouble() * RANGE;
                return new IsoscelesTrapezoid(color, base1, base2, heightTrapezoid);
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
