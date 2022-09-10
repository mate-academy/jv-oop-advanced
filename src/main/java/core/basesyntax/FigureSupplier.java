package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final String DEFAULT_COLOR = Color.WHITE.name();
    public static final double DEFAULT_RADIUS = 10;
    public static final int MAX_RANDOM_Number = 50;
    public static final int MIN_RANDOM_Number = 1;
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigureIndex = random.nextInt(FIGURE_COUNT);
        switch (randomFigureIndex) {
            case 0:
                return new Circle(color.getRandomColor(), getDouble());
            case 1:
                return new IsoscelesTrapezoid(color.getRandomColor(), getDouble(), getDouble(),
                    getDouble());
            case 2:
                return new Rectangle(color.getRandomColor(), getDouble(), getDouble());
            case 3:
                return new RightTriangle(color.getRandomColor(), getDouble(), getDouble());
            case 4:
            default:
                return new Square(color.getRandomColor(), getDouble());
        }
    }

    private double getDouble() {
        return MIN_RANDOM_Number + random.nextInt(MAX_RANDOM_Number) + random.nextDouble();
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
