package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_VALUE = 100;
    private static final int DEFAULT_RADIUS = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        Color color = colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 0:
                int radius = random.nextInt(MAX_VALUE) + 1;
                return new Circle(color, radius);
            case 1:
                int side = random.nextInt(MAX_VALUE) + 1;
                return new Square(color, side);
            case 2:
                int width = random.nextInt(MAX_VALUE) + 1;
                int height = random.nextInt(MAX_VALUE) + 1;
                return new Rectangle(color, width, height);
            case 3:
                int firstLeg = random.nextInt(MAX_VALUE) + 1;
                int secondLeg = random.nextInt(MAX_VALUE) + 1;
                return new RightTriangle(color, firstLeg, secondLeg);
            default:
                int base1 = random.nextInt(MAX_VALUE) + 1;
                int base2 = random.nextInt(MAX_VALUE) + 1;
                int trapezoidHeight = random.nextInt(MAX_VALUE) + 1;
                return new IsoscelesTrapezoid(color, base1, base2, trapezoidHeight);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }
}
