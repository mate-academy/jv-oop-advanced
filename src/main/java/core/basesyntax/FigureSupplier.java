package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_MAX = 10.0;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static Random random = new Random();

    public static Figure getRandomFigure() {
        int type = random.nextInt(5);
        String color = String.valueOf(ColorSupplier.getRandomColor());
        double parameterOne = random.nextDouble() * DEFAULT_MAX + 1;
        double parameterTwo = random.nextDouble() * DEFAULT_MAX + 1;
        switch (type) {
            case 0:
                return new Square(color,(DEFAULT_MAX));
            case 1:
                return new Rectangle(color,(DEFAULT_MAX), (DEFAULT_MAX));
            case 2:
                return new RightTriangle(color,(DEFAULT_MAX), (DEFAULT_MAX));
            case 3:
                return new Circle(color,(DEFAULT_MAX));
            case 4:
                return new IsoscelesTrapezoid(color,(DEFAULT_MAX),
                       (DEFAULT_MAX),(DEFAULT_MAX));
            default:
                throw new RuntimeException("Unknown figure type");
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
