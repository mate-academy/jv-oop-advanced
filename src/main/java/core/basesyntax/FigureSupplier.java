package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int INTEGER_BOUND = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(INTEGER_BOUND),
                        random.nextInt(INTEGER_BOUND));
            case 1:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(INTEGER_BOUND));
            case 2:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(INTEGER_BOUND));
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(INTEGER_BOUND),
                        random.nextInt(INTEGER_BOUND),
                        random.nextInt(INTEGER_BOUND));
            default:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(INTEGER_BOUND));
        }
    }

    public Figure getDefaultFigure() {
        return new Square(Color.ORANGE.name(), 4);
    }
}
