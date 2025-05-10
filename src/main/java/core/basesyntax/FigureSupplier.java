package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_NUMBER_OF_FIGURE = 4;
    public static final int MAX_SIZE_OF_PARAMETER = 10;
    public static final int DEFAULT_NUMBER = 10;
    public static final String DEFAULT_COLOR = "white";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(MAX_NUMBER_OF_FIGURE)) {
            case 0:
                int side = random.nextInt(MAX_SIZE_OF_PARAMETER);
                return new Square(colorSupplier.getRandomColor(), side);
            case 1:
                int width = random.nextInt(MAX_SIZE_OF_PARAMETER);
                int length = random.nextInt(MAX_SIZE_OF_PARAMETER);
                return new Rectangle(colorSupplier.getRandomColor(), width, length);
            case 2:
                int firstLeg = random.nextInt(MAX_SIZE_OF_PARAMETER);
                int secondLeg = random.nextInt(MAX_SIZE_OF_PARAMETER);
                return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
            case 3:
                int radius = random.nextInt(MAX_SIZE_OF_PARAMETER);
                return new Circle(colorSupplier.getRandomColor(), radius);
            default:
                int topSide = random.nextInt(MAX_SIZE_OF_PARAMETER);
                int downSide = random.nextInt(MAX_SIZE_OF_PARAMETER);
                int lateraSide = random.nextInt(MAX_SIZE_OF_PARAMETER);
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        topSide, downSide, lateraSide);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_NUMBER);
    }
}
