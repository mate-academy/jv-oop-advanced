package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int LIMIT_NUMBER = 20;
    private static final int CIRCLE_RADIUS = 10;
    private static final String CIRCLE_COLOR = "white";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();

        switch (random.nextInt(4)) {
            case 0:
                return new Circle(randomColor, random.nextInt(LIMIT_NUMBER));
            case 1:
                return new Square(randomColor, random.nextInt(LIMIT_NUMBER));
            case 2:
                return new IsoscelesTrapezoid(randomColor,
                        random.nextInt(LIMIT_NUMBER),
                        random.nextInt(LIMIT_NUMBER),
                        random.nextInt(LIMIT_NUMBER));
            case 3:
                return new Rectangle(randomColor,
                        random.nextInt(LIMIT_NUMBER),
                        random.nextInt(LIMIT_NUMBER));
            case 4:
                return new RightTriangle(randomColor,
                        random.nextInt(LIMIT_NUMBER),
                        random.nextInt(LIMIT_NUMBER));
            default:
                return new Circle(CIRCLE_COLOR, CIRCLE_RADIUS);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_COLOR, CIRCLE_RADIUS);
    }
}
