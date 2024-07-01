package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_AMOUNT = 5;
    private static final int SIDE_LENGTH = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_AMOUNT);
        switch (figureType) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(SIDE_LENGTH) + 1);
            case 1:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(SIDE_LENGTH) + 1);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(SIDE_LENGTH) + 1,
                        random.nextInt(SIDE_LENGTH) + 1);
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(SIDE_LENGTH) + 1,
                        random.nextInt(SIDE_LENGTH) + 1,
                        random.nextInt(SIDE_LENGTH) + 1);
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(SIDE_LENGTH) + 1, random.nextInt(SIDE_LENGTH) + 1);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}

