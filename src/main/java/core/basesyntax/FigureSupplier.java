package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_PARAMETER_VALUE = 50;
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                int side = random.nextInt(MAX_PARAMETER_VALUE) + 1;
                return new Square(Color.valueOf(colorSupplier.getRandomColor()), side);
            case 1:
                int radius = random.nextInt(MAX_PARAMETER_VALUE) + 1;
                return new Circle(Color.valueOf(colorSupplier.getRandomColor()), radius);
            case 2:
                int firstLeg = random.nextInt(MAX_PARAMETER_VALUE) + 1;
                int secondLeg = random.nextInt(MAX_PARAMETER_VALUE) + 1;
                return new RightTriangle(Color.valueOf(colorSupplier.getRandomColor()),
                        firstLeg,
                        secondLeg);
            case 3:
                int width = random.nextInt(MAX_PARAMETER_VALUE) + 1;
                int height = random.nextInt(MAX_PARAMETER_VALUE) + 1;
                return new Rectangle(Color.valueOf(colorSupplier.getRandomColor()), width, height);
            case 4:
                int leg = random.nextInt(MAX_PARAMETER_VALUE) + 1;
                int baseA = random.nextInt(MAX_PARAMETER_VALUE) + 1;
                int baseB = random.nextInt(MAX_PARAMETER_VALUE) + 1;
                int h = random.nextInt(MAX_PARAMETER_VALUE) + 1;
                return new IsoscelesTrapezoid(Color.valueOf(colorSupplier.getRandomColor()),
                        leg,
                        baseA,
                        baseB,
                        h);
            default:
                throw new IllegalArgumentException("Invalid figure number " + figureNumber);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
