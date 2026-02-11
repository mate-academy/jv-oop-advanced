package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final ColorSupplier supplier = new ColorSupplier();
    private static final double DEFAULT_RADIUS = 10.0;
    private static final int FIGURE_COUNT = 5;
    private static final double BOUND_VALUE = 11.0;

    public Figure getDefaultFigure() {
        return new Circle(supplier.getDefaultColor(), DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FIGURE_COUNT);

        switch (randomFigure) {
            case 0: {
                String color = supplier.getRandomColor();
                double randomDouble = random.nextDouble(BOUND_VALUE);
                return new Circle(color, randomDouble);
            }
            case 1: {
                String color = supplier.getRandomColor();
                double side = random.nextDouble(BOUND_VALUE);
                return new Square(color, side);
            }
            case 2: {
                String color = supplier.getRandomColor();
                double length = random.nextDouble(BOUND_VALUE);
                double width = random.nextDouble(BOUND_VALUE);
                return new Rectangle(color, length, width);
            }
            case 3: {
                String color = supplier.getRandomColor();
                double height = random.nextDouble(BOUND_VALUE);
                double topBase = random.nextDouble(BOUND_VALUE);
                double bottomBase = random.nextDouble(BOUND_VALUE);
                return new IsoscelesTrapezoid(color, height,
                        topBase, bottomBase);
            }
            case 4: {
                String color = supplier.getRandomColor();
                double firstLeg = random.nextDouble(BOUND_VALUE);
                double secondLeg = random.nextDouble(BOUND_VALUE);
                return new RightTriangle(color, firstLeg, secondLeg);
            }
            default: {
                return getDefaultFigure();
            }
        }
    }
}
