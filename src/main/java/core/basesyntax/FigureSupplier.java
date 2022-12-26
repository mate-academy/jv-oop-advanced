package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randNum = random.nextInt(FIGURE_COUNT);
        switch (randNum) {
            case (0):
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(100));
            case (1):
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(100), random.nextInt(100));
            case (2):
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(100), random.nextInt(100));
            case (3):
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(100), random.nextInt(100));
            case (4):
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(100));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}

