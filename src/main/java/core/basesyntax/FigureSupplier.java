package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static int MAX_RANDOM_VALUE = 15;
    private static final int FIGURE_COUNT = 5;
    private static final int DEFOLT_VALUE = 10;
    private static final String DEFOLT_COLOR = Color.WHITE.name();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_VALUE));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_VALUE),
                        random.nextInt(MAX_RANDOM_VALUE),
                        random.nextInt(MAX_RANDOM_VALUE));
            case 2:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_VALUE));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_VALUE),
                        random.nextInt(MAX_RANDOM_VALUE));
            default:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_VALUE),
                        random.nextInt(MAX_RANDOM_VALUE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFOLT_COLOR,DEFOLT_VALUE);
    }
}
