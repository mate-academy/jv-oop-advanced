package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_PARAMETER_VALUE = 50;
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomfigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                int side = random.nextInt(MAX_PARAMETER_VALUE);
                return new Square(colorSupplier.getRandomColor(), side);
            case 1:
                int radius = random.nextInt(MAX_PARAMETER_VALUE);
                return new Circle(colorSupplier.getRandomColor(), radius);
            case 2:
                int firstLeg = random.nextInt(MAX_PARAMETER_VALUE);
                int secondLeg = random.nextInt(MAX_PARAMETER_VALUE);
                return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
            case 3:
                int width = random.nextInt(MAX_PARAMETER_VALUE);
                int height = random.nextInt(MAX_PARAMETER_VALUE);
                return new Rectangle(colorSupplier.getRandomColor(), width, height);
            case 4:
                int leg = random.nextInt(MAX_PARAMETER_VALUE);
                int baseA = random.nextInt(MAX_PARAMETER_VALUE);
                int baseB = random.nextInt(MAX_PARAMETER_VALUE);
                int h = random.nextInt(MAX_PARAMETER_VALUE);
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), baseA, baseB, h);
            default:
                throw new IllegalArgumentException("Invalid figure number " + figureNumber);
        }
    }

    public Figure getDefaultfigure() {
        return new Circle(Color.WHITE, 10);
    }
}
