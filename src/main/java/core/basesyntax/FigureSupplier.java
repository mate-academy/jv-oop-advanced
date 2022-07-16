package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int COUNT_OF_FIGURES = 5;
    private static final int MAX_INT = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int numberOfFigure = random.nextInt(5);
        switch (numberOfFigure) {
            case 0:
                return new Circle(random.nextInt(MAX_INT), colorSupplier.getRandomColor());
            case 1:
                return new Square(random.nextInt(MAX_INT), colorSupplier.getRandomColor());
            case 2:
                return new Rectangle(random.nextInt(MAX_INT), random.nextInt(MAX_INT),
                        colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(random.nextInt(MAX_INT), random.nextInt(MAX_INT),
                        colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(MAX_INT), random.nextInt(MAX_INT),
                        random.nextInt(MAX_INT),
                        colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.toString().toLowerCase());
    }
}
