package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final double DEFAULT_MAX = 10.0;
    public static final int DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = Color.WHITE.name();
    private static Random random = new Random();

    public static Figure getRandomFigure() {
        int type = random.nextInt(5);
        String color = String.valueOf(ColorSupplier.getRandomColor());
        double parameter1 = random.nextDouble() * DEFAULT_MAX + 1;
        double parameter2 = random.nextDouble() * DEFAULT_MAX + 1;
        switch (type) {
            case 0:
                return new Square(color,getRandomParameter(DEFAULT_MAX));
            case 1:
                return new Rectangle(color, getRandomParameter(DEFAULT_MAX), (DEFAULT_MAX));
            case 2:
                return new RightTriangle(color, getRandomParameter(DEFAULT_MAX), (DEFAULT_MAX));
            case 3:
                return new Circle(color,getRandomParameter(DEFAULT_MAX));
            case 4:
                return new IsoscelesTrapezoid(color, getRandomParameter(DEFAULT_MAX),
                        getRandomParameter(DEFAULT_MAX),getRandomParameter(DEFAULT_MAX));
            default:
                throw new RuntimeException("Unknown figure type");
        }
    }

    private static double getRandomParameter(double defaultMax) {
        return defaultMax;
    }

    public static Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
