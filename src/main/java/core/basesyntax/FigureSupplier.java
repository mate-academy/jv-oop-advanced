package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURES = 5;
    public static final double MAX_VALUE = 10.0;
    public static final double DEFAULT_RADIUS = 5.0;
    public static final Color DEFAULT_COLOR = Color.WHITE;

    private final Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURES);

        switch (figureType) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextDouble(MAX_VALUE));
            case 1:
                return new Rectangle(random.nextDouble(MAX_VALUE),
                        random.nextDouble(MAX_VALUE),
                        colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(random.nextDouble(MAX_VALUE),
                        random.nextDouble(MAX_VALUE),
                        colorSupplier.getRandomColor());
            case 3:
                return new Circle(random.nextDouble(MAX_VALUE),
                        colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(random.nextDouble(MAX_VALUE),
                        random.nextDouble(MAX_VALUE),
                        random.nextDouble(),
                        colorSupplier.getRandomColor());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
