package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int RADIUS_OF_CIRCLE = 10;
    public static final int MAX_BOUND = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final int randomInt = random.nextInt(FIGURE_COUNT);
    private final int randomValue = random.nextInt(MAX_BOUND);
    private final String randomColor = Color.valueOf(colorSupplier.getRandomColor()).name();

    public Figure getRandomFigure() {
        switch (randomInt) {
            case 0:
                return new Square(randomValue, Color.valueOf(randomColor));
            case 1:
                return new Rectangle(randomValue, random.nextInt(MAX_BOUND),
                        Color.valueOf(randomColor));
            case 2:
                return new RightTriangle(randomValue, random.nextInt(MAX_BOUND),
                        Color.valueOf(randomColor));
            case 3:
                return new Circle(randomValue, Color.valueOf(randomColor));
            case 4:
                return new IsoscelesTrapezoid(randomValue, random.nextInt(MAX_BOUND),
                        random.nextInt(MAX_BOUND), Color.valueOf(randomColor));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(RADIUS_OF_CIRCLE,Color.WHITE);
    }
}
