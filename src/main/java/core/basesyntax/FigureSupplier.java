package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_BOUND = 10;
    public static final double DEFAULT_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        Color color = Color.valueOf(colorSupplier.getRandomColor());

        switch (figureType) {
            case 0:
                return new Circle(randomDouble(), color);
            case 1:
                return new Square(randomDouble(), color);
            case 2:
                return new Rectangle(randomDouble(), randomDouble(), color);
            case 3:
                return new RightTriangle(randomDouble(), randomDouble(), color);
            case 4:
                return new IsoscelesTrapezoid(randomDouble(), randomDouble(),
                        randomDouble(), color);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE);
    }

    private double randomDouble() {
        return random.nextInt(MAX_BOUND) + 1;
    }
}
