package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final String DEFAULT_COLOR = Color.WHITE.name();
    public static final int DEFAULT_RADIUS = 10;
    
    private static final int BOTTOM_RANDOM_BOUND = 0;
    private static final int UPPER_RANDOM_BOUND = 20;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int randomInt = random.nextInt(BOTTOM_RANDOM_BOUND, UPPER_RANDOM_BOUND);

        Figure[] figures = {
                new Circle(randomColor, randomInt),
                new Square(randomColor, randomInt),
                new Rectangle(randomColor,
                        randomInt,
                        randomInt
                ),
                new RightTriangle(randomColor, randomInt, randomInt),
                new IsoscelesTrapezoid(
                        randomColor,
                        randomInt,
                        randomInt,
                        randomInt)
        };

        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.toLowerCase(), DEFAULT_RADIUS);
    }
}
