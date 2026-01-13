package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private static final int MAX_SIZE = 100;
    private static final int bound = 5;

    public Figure getRandomFigure() {
        switch (random.nextInt(bound)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(bound + 1));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE + 1),
                        random.nextInt(MAX_SIZE + 1), random.nextInt(MAX_SIZE + 1));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE + 1),
                        random.nextInt(MAX_SIZE + 1));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE + 1),
                        random.nextInt(MAX_SIZE + 1));

            default:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(bound + 1));
        }

    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

}
