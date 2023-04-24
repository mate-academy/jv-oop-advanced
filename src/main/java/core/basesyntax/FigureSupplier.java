package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_NUMBER_OF_FIGURE = 4;
    public static final int MAX_SIZE_OF_PARAMETER = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Circle circle = new Circle("white", 10);

    public Figure getRandomFigure() {
        switch (random.nextInt(MAX_NUMBER_OF_FIGURE)) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE_OF_PARAMETER));
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE_OF_PARAMETER),
                        random.nextInt(MAX_SIZE_OF_PARAMETER));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE_OF_PARAMETER),
                        random.nextInt(MAX_SIZE_OF_PARAMETER));
            case 3:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE_OF_PARAMETER));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE_OF_PARAMETER),
                        random.nextInt(MAX_SIZE_OF_PARAMETER),
                        random.nextInt(MAX_SIZE_OF_PARAMETER));
        }
    }

    public Figure getDefaultFigure() {
        return circle;
    }
}
