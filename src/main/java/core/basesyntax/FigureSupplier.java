package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int MAX_VALUE = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle("white", 10.00);
    }

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURES_COUNT);
        switch (figureIndex) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE));
            case 2:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
        }
    }
}
