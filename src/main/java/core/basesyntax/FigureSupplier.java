package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int ALLOWABLE_RANGE_OF_UNITS = 50;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT + 1);

        switch (figureNumber) {
            case 1:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(ALLOWABLE_RANGE_OF_UNITS));
            case 2:
                return new Circle(colorSupplier.getRandomColor(),
                    random.nextInt(ALLOWABLE_RANGE_OF_UNITS));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(ALLOWABLE_RANGE_OF_UNITS),
                        random.nextInt(ALLOWABLE_RANGE_OF_UNITS));
            case 4:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(ALLOWABLE_RANGE_OF_UNITS),
                        random.nextInt(ALLOWABLE_RANGE_OF_UNITS));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextInt(ALLOWABLE_RANGE_OF_UNITS),
                    random.nextInt(ALLOWABLE_RANGE_OF_UNITS),
                    random.nextInt(ALLOWABLE_RANGE_OF_UNITS));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(), 10);
    }
}
