package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            case 4:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE));
            default:
                return null;
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
