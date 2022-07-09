package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final int MAX_VALUE = 50;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_CIRCLE_COLOR = Color.white.name();

    public Figure getRandomFigure() {
        int figureAmount = 5;
        int figureNumber = random.nextInt(figureAmount);
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (figureNumber) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            default:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }
}