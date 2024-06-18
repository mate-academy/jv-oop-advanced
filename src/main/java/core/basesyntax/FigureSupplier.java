package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_SIZE = 20;

    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT) + 1;

        return switch (figureNumber) {
            case 1 -> new Circle(supplier.getRandomColor(),
                    random.nextInt(MAX_SIZE));
            case 2 -> new IsoscelesTrapezoid(supplier.getRandomColor(),
                    random.nextInt(MAX_SIZE),
                    random.nextInt(MAX_SIZE),
                    random.nextInt(MAX_SIZE));
            case 3 -> new Rectangle(supplier.getRandomColor(),
                    random.nextInt(MAX_SIZE),
                    random.nextInt(MAX_SIZE));
            case 4 -> new RightTriangle(supplier.getRandomColor(),
                    random.nextInt(MAX_SIZE),
                    random.nextInt(MAX_SIZE));
            case 5 -> new Square(supplier.getRandomColor(),
                    random.nextInt(MAX_SIZE));
            default -> throw new IllegalStateException("Unexpected figure number: " + figureNumber);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
