package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_BOUND = 30;
    private static final int DEFAULT = 10;

    private static final int AMOUNT_OF_FIGURES = 6;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT);
    }

    public Figure getRandomFigure() {
        int randomize = random.nextInt(AMOUNT_OF_FIGURES);
        switch (randomize) {
            case 1:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_BOUND));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_BOUND), random.nextInt(MAX_BOUND));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_BOUND),
                        random.nextInt(MAX_BOUND));
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_BOUND), random.nextInt(MAX_BOUND),
                        random.nextInt(MAX_BOUND));
            default:
                return getDefaultFigure();
        }
    }
}
