package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);

        switch (figureType) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextDouble() * 10 + 1);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1);
            case 3:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextDouble() * 10 + 1);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1);
            default:
                throw new IllegalStateException("Invalid figure type generated");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
