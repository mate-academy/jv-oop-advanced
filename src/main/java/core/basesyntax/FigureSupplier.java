package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURES = 5;
    public static final int MAX_VALUE = 10;
    public static final int DEFAULT_RADIUS = 5;
    public static final Color DEFAULT_COLOR = Color.WHITE;

    private final Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURES);

        switch (figureType) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE));
            case 1:
                return new Rectangle(random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE),
                        colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE),
                        colorSupplier.getRandomColor());
            case 3:
                return new Circle(random.nextInt(MAX_VALUE),
                        colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(),
                        colorSupplier.getRandomColor());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
