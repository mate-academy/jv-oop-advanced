package core.basesyntax;

import java.util.concurrent.ThreadLocalRandom;

public class FigureSupplier {
    private static final int MAX_SIDE = 200;
    private static final int FIGURE_COUNT = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final ThreadLocalRandom random = ThreadLocalRandom.current();

    public Figure getRandomFigure() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomIndex = random.nextInt(0, FIGURE_COUNT);
        // 3
        int side1 = random.nextInt(1, MAX_SIDE);
        int side2 = random.nextInt(1, MAX_SIDE);
        switch (randomIndex) {
            case 0:
                int randomRadius = random.nextInt(1, MAX_SIDE);
                return new Circle(randomRadius, randomColor);
            case 1:
                return new Rectangle(side1, side2, randomColor);
            case 2:
                return new RightTriangle(side1, side2, randomColor);
            case 3:
                return new Square(side1, randomColor);
            case 4:
                int height = random.nextInt(1, MAX_SIDE);
                return new IsoscelesTrapezoid(side1, side2, height, randomColor);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
