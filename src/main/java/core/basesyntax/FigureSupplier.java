package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_BOUND = 5;
    private static final int LENGTH_BOUND = 100;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        final String color = colorSupplier.getRandomColor();
        final int index = random.nextInt(FIGURES_BOUND);
        final int firstRandom = random.nextInt(LENGTH_BOUND);
        final int secondRandom = random.nextInt(LENGTH_BOUND);
        final int thirdRandom = random.nextInt(LENGTH_BOUND);
        switch (index) {
            case 0:
                return new Circle(firstRandom, color);
            case 1:
                return new IsoscelesTrapezoid(firstRandom, secondRandom,
                        thirdRandom, color);
            case 2:
                return new Rectangle(firstRandom, secondRandom, color);
            case 3:
                return new RightTriangle(firstRandom, secondRandom, color);
            default:
                return new Square(firstRandom, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR.toString());
    }
}
