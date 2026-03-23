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
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    public Figure getRandomFigure() {
        int type = random.nextInt(FIGURE_COUNT);

        switch (type) {
            case 0: {
                double radius = random.nextDouble() * 10 + 1;
                return new Circle(colorSupplier.getRandomColor(), radius);
            }
            case 1: {
                double upperBase = random.nextDouble() * 10 + 1;
                double lowerBase = random.nextDouble() * 10 + 1;
                double height = random.nextDouble() * 10 + 1;
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        upperBase,
                        lowerBase,
                        height
                );
            }
            case 2: {
                double height = random.nextDouble() * 10 + 1;
                double width = random.nextDouble() * 10 + 1;
                return new Rectangle(
                        colorSupplier.getRandomColor(),
                        height,
                        width
                );
            }
            case 3: {
                double firstLeg = random.nextDouble() * 10 + 1;
                double secondLeg = random.nextDouble() * 10 + 1;
                return new RightTriangle(
                        colorSupplier.getRandomColor(),
                        firstLeg,
                        secondLeg
                );
            }
            default: {
                double side = random.nextDouble() * 10 + 1;
                return new Square(colorSupplier.getRandomColor(), side);
            }
        }
    }
}

