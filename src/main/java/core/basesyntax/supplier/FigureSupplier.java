package core.basesyntax.supplier;

import core.basesyntax.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_VALUE = 10;
    private static final int MIN_VALUE = 1;
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_NUMBER = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_NUMBER);
    }

    public Figure getRandomFigure() {
        int type = random.nextInt(FIGURE_COUNT);

        switch (type) {
            case 0: {
                double radius = random.nextDouble() * MAX_VALUE + MIN_VALUE;
                String color = colorSupplier.getRandomColor();
                return new Circle(color, radius);
            }
            case 1: {
                String color = colorSupplier.getRandomColor();
                double upperBase = random.nextDouble() * MAX_VALUE + MIN_VALUE;
                double lowerBase = random.nextDouble() * MAX_VALUE + MIN_VALUE;
                double height = random.nextDouble() * MAX_VALUE + MIN_VALUE;
                return new IsoscelesTrapezoid(
                        color,
                        upperBase,
                        lowerBase,
                        height
                );
            }
            case 2: {
                String color = colorSupplier.getRandomColor();
                double height = random.nextDouble() * MAX_VALUE + MIN_VALUE;
                double width = random.nextDouble() * MAX_VALUE + MIN_VALUE;
                return new Rectangle(
                        color,
                        height,
                        width
                );
            }
            case 3: {
                String color = colorSupplier.getRandomColor();
                double firstLeg = random.nextDouble() * MAX_VALUE + MIN_VALUE;
                double secondLeg = random.nextDouble() * MAX_VALUE + MIN_VALUE;
                return new RightTriangle(
                        color,
                        firstLeg,
                        secondLeg
                );
            }
            default: {
                String color = colorSupplier.getRandomColor();
                double side = random.nextDouble() * MAX_VALUE + MIN_VALUE;
                return new Square(color, side);
            }
        }
    }
}