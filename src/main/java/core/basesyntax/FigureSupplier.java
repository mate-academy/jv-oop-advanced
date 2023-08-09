package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String WHITE = Color.WHITE.getColor();
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_VALUE = 20;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE));
            case 1:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(WHITE, DEFAULT_RADIUS);
    }
}
