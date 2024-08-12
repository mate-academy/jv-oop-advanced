package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        int figurType = RANDOM.nextInt(5);
        String color = new ColorSupplier().getRandomColor();
        switch (figurType) {
            case 0:
                return new Circle(color, RANDOM.nextInt(10) + 1);
            case 1:
                return new Square(color, RANDOM.nextInt(10) + 1);
            case 2:
                return new Rectangle(color, RANDOM.nextInt(10) + 1, RANDOM.nextInt(10) + 1);
            case 3:
                return new RightTriangle(color, RANDOM.nextInt(10) + 1,
                        RANDOM.nextInt(10) + 1, RANDOM.nextInt(10) + 1);
            case 4:
                return new IsoscelesTrapezoid(color, RANDOM.nextInt(10) + 1,
                        RANDOM.nextInt(10) + 1, RANDOM.nextInt(10) + 1);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
