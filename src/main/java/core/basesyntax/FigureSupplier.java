package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 4;
    private static final int PARAMETER = 20;
    private static final int DEFAULT_PARAMETER = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomVar = new Random().nextInt(FIGURE_COUNT);
        switch (randomVar) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(PARAMETER));
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(PARAMETER),
                        random.nextInt(PARAMETER));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(PARAMETER),
                        random.nextInt(PARAMETER));
            case 3:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(PARAMETER));
            case 4:
            default:
                return new IsoscelesTraprzoid(colorSupplier.getRandomColor(),
                        random.nextInt(PARAMETER),
                        random.nextInt(PARAMETER),
                        random.nextInt(PARAMETER));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", DEFAULT_PARAMETER);
    }
}
