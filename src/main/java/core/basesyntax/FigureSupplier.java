package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final double MAX_RANDOM_VALUE = 10.;
    private static final int AMOUNT_OF_FIGURES = 5;

    public static Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();

        switch (random.nextInt(AMOUNT_OF_FIGURES)) {
            case 0:
                return new Square(color, random.nextDouble(MAX_RANDOM_VALUE));
            case 1:
                return new Circle(color, random.nextDouble(MAX_RANDOM_VALUE));
            case 2:
                return new IsoscelesTrapezoid(color,
                        random.nextDouble(MAX_RANDOM_VALUE),random.nextDouble(MAX_RANDOM_VALUE),
                        random.nextDouble(MAX_RANDOM_VALUE));
            case 3:
                return new RightTriangle(color,
                        random.nextDouble(MAX_RANDOM_VALUE),
                        random.nextDouble(MAX_RANDOM_VALUE));
            default:
                return new Rectangle(color,
                        random.nextDouble(MAX_RANDOM_VALUE),
                        random.nextDouble(MAX_RANDOM_VALUE));
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
