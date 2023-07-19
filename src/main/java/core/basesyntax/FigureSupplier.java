package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RAZMER = 15;
    private static final int NUMBER_FIGURE = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int radius = random.nextInt(MAX_RAZMER) + 1;
        int side = random.nextInt(MAX_RAZMER) + 1;
        int width = random.nextInt(MAX_RAZMER) + 1;
        int height = random.nextInt(MAX_RAZMER) + 1;
        int topBasis = random.nextInt(MAX_RAZMER) + 1;
        int bottomBasis = random.nextInt(MAX_RAZMER) + 1;
        switch (random.nextInt(NUMBER_FIGURE)) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(), radius);
            case 2:
                return new Square(colorSupplier.getRandomColor(), side);
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(), width, height);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        topBasis, bottomBasis, side);
            default:
                return new RightTriangle(colorSupplier.getRandomColor(), side);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(),10);
    }
}
