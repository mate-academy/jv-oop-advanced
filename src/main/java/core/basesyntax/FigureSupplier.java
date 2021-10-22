package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 4;
    private static final int MAX_RANDOM_PARAMETER = 20;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomVar = new Random().nextInt(FIGURE_COUNT);
        switch (randomVar) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_PARAMETER));
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_PARAMETER),
                        random.nextInt(MAX_RANDOM_PARAMETER));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_PARAMETER),
                        random.nextInt(MAX_RANDOM_PARAMETER));
            case 3:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_PARAMETER));
            case 4:
            default:
                return new IsoscelesTraprzoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_PARAMETER),
                        random.nextInt(MAX_RANDOM_PARAMETER),
                        random.nextInt(MAX_RANDOM_PARAMETER));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), DEFAULT_RADIUS);
    }
}
