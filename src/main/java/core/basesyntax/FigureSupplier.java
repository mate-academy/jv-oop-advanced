package core.basesyntax;

import java.util.Locale;
import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureType[] figures = FigureType.values();
        FigureType randomFigure = figures[random.nextInt(figures.length)];

        switch (randomFigure) {
            case SQUARE: {
                int side = random.nextInt(10) + 1;
                return new Square(colorSupplier.getRandomColor(), side);
            }
            case RECTANGLE: {
                int height = random.nextInt(10) + 1;
                int width = random.nextInt(10) + 1;
                return new Rectangle(colorSupplier.getRandomColor(), width, height);
            }
            case RIGHT_TRIANGLE: {
                int firstLeg = random.nextInt(10) + 1;
                int secondLeg = random.nextInt(10) + 1;
                return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
            }
            case CIRCLE: {
                int radius = random.nextInt(10) + 1;
                return new Circle(colorSupplier.getRandomColor(), radius);
            }
            case ISOSCELES_TRAPEZOID: {
                int upperBase = random.nextInt(10) + 1;
                int lowerBase = random.nextInt(10) + 1;
                int height = random.nextInt(10) + 1;
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        upperBase, lowerBase, height);
            }
            default:
                throw new IllegalStateException("Unknown figure type");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white".toUpperCase(Locale.ROOT), 10);

    }

}


