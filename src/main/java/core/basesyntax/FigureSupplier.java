package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_SIZE = 20;

    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT) + 1;

        return switch (figureNumber) {
            case 1 -> {
                int radius = random.nextInt(MAX_SIZE);
                yield new Circle(supplier.getRandomColor().getDisplayName(),
                        radius);
            }
            case 2 -> {
                int base1 = random.nextInt(MAX_SIZE);
                int base2 = random.nextInt(MAX_SIZE);
                int height = random.nextInt(MAX_SIZE);
                yield new IsoscelesTrapezoid(supplier.getRandomColor().getDisplayName(),
                        base1,
                        base2,
                        height);
            }
            case 3 -> {
                int length = random.nextInt(MAX_SIZE);
                int width = random.nextInt(MAX_SIZE);
                yield new Rectangle(supplier.getRandomColor().getDisplayName(),
                        length,
                        width);
            }
            case 4 -> {
                int firstLeg = random.nextInt(MAX_SIZE);
                int secondLeg = random.nextInt(MAX_SIZE);
                yield new RightTriangle(supplier.getRandomColor().getDisplayName(),
                        firstLeg,
                        secondLeg);
            }
            case 5 -> {
                int side = random.nextInt(MAX_SIZE);
                yield new Square(supplier.getRandomColor().getDisplayName(),
                        side);
            }
            default -> throw new IllegalStateException("Unexpected value: " + figureNumber);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
