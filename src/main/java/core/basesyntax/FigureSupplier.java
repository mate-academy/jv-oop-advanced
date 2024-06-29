package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_SIZE = 11.0;
    private static final double DEFAULT_RADIUS = 10.0;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);

        switch (figureType) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), random.nextDouble() * MAX_SIZE);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * MAX_SIZE,
                        random.nextDouble() * MAX_SIZE);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * MAX_SIZE,
                        random.nextDouble() * MAX_SIZE);
            case 3:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextDouble() * MAX_SIZE);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble() * MAX_SIZE,
                        random.nextDouble() * MAX_SIZE, random.nextDouble() * MAX_SIZE);
            default:
                return getDefaultFigure();
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(Color.white, DEFAULT_RADIUS);
    }
}
