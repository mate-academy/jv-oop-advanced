package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    protected static final int MAX_SIZE_VARIABLE = 10;
    private static final int FIGURES_COUNT = 5;

    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURES_COUNT);

        switch (figureIndex) {
            case 0:
                return new Circle(random.nextInt(MAX_SIZE_VARIABLE));
            case 1:
                return new Square(random.nextInt(MAX_SIZE_VARIABLE));
            case 2:
                return new Rectangle(random.nextInt(MAX_SIZE_VARIABLE),
                        random.nextInt(MAX_SIZE_VARIABLE));
            case 3:
                return new RightTriangle(random.nextInt(MAX_SIZE_VARIABLE),
                        random.nextInt(MAX_SIZE_VARIABLE));
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(MAX_SIZE_VARIABLE),
                        random.nextInt(MAX_SIZE_VARIABLE),
                        random.nextInt(MAX_SIZE_VARIABLE));
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
