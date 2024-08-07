package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_SIZE_OF_UNITS = 10.0;
    private static final int COUNT_OF_FIGURE = 5;
    private static final double SIZE_OF_RADIUS = 10.0;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(COUNT_OF_FIGURE);
        switch (figureType) {
            case 0:
                return new Square(colorSupplier.getRandomColor().toLowerCase(), random.nextDouble()
                        * MAX_SIZE_OF_UNITS);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor().toLowerCase(),
                        random.nextDouble() * MAX_SIZE_OF_UNITS, random.nextDouble()
                        * MAX_SIZE_OF_UNITS);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor().toLowerCase(),
                        random.nextDouble()
                        * MAX_SIZE_OF_UNITS, random.nextDouble()
                        * MAX_SIZE_OF_UNITS);
            case 3:
                return new Circle(colorSupplier.getRandomColor().toLowerCase(),
                        random.nextDouble() * MAX_SIZE_OF_UNITS);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor().toLowerCase(),
                        random.nextDouble()
                        * MAX_SIZE_OF_UNITS, random.nextDouble()
                        * MAX_SIZE_OF_UNITS, random.nextDouble()
                        * MAX_SIZE_OF_UNITS);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", SIZE_OF_RADIUS);
    }
}
