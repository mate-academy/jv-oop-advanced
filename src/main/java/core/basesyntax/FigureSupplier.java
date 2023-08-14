package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        switch (figureType) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt());
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(), random.nextInt());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(), random.nextInt());
            case 3:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt());
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(), random.nextInt(), random.nextInt());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", RADIUS);
    }
}
