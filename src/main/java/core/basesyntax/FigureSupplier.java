package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    private static ColorSupplier WHITE;

    private final Random random = new Random();

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new IsoscelesTrapezoid(colorSupplier,random.nextDouble() * 10,
                        random.nextDouble() * 10, random.nextDouble() * 10);
            case 1:
                return new Circle(colorSupplier, random.nextDouble() * 10);
            case 2:
                return new RightTriangle(colorSupplier,random.nextDouble() * 10,
                        random.nextDouble() * 10);
            case 3:
                return new Rectangle(colorSupplier, random.nextDouble() * 10,
                        random.nextDouble() * 10);
            default:
                return new Square(colorSupplier, random.nextDouble() * 10);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(WHITE, 10);
    }
}
