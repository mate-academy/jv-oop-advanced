package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_SIZE = 10;
    private final ColorSupplier colorSupplier;

    {
        colorSupplier = new ColorSupplier();
    }

    private final Random random = new Random();

    public Figure getRandomFigure() {
        Color color = colorSupplier.getRandomColor();
        int numFigureTypes = 5;
        int figureType = random.nextInt(numFigureTypes);

        switch (figureType) {
            case 0:
                return new Square(random.nextDouble() * MAX_SIZE,color);
            case 1:
                return new Rectangle(random.nextDouble() * MAX_SIZE,
                        random.nextDouble() * MAX_SIZE, color);
            case 2:
                return new RightTriangle(random.nextDouble() * MAX_SIZE,
                        random.nextDouble() * MAX_SIZE, color);
            case 3:
                return new Circle(random.nextDouble() * MAX_SIZE, color);
            case 4:
            default:
                return new IsoscelesTrapezoid(random.nextDouble() * MAX_SIZE,
                        random.nextDouble() * MAX_SIZE, random.nextDouble() * MAX_SIZE, color);

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
