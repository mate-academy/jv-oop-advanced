package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int RANDOM_COUNT = 20;
    public static final int DEFAULT_RADIUS = 10;
    public static final String DEFULT_COLOR = "white";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure [] figure = new Figure[5];
        figure[0] = new Square(random.nextInt(1, RANDOM_COUNT), colorSupplier.getRandomColor());
        figure[1] = new Circle(random.nextInt(1, RANDOM_COUNT), colorSupplier.getRandomColor());
        figure[2] = new Rectangle(random.nextInt(1, RANDOM_COUNT),
                                  random.nextInt(1, RANDOM_COUNT),
                                  colorSupplier.getRandomColor());
        figure[3] = new RightTriangle(random.nextInt(1, RANDOM_COUNT),
                                      random.nextInt(1, RANDOM_COUNT),
                                      colorSupplier.getRandomColor());
        figure[4] = new IsoscelesTrapezoid(random.nextInt(1, RANDOM_COUNT),
                                           random.nextInt(1, RANDOM_COUNT),
                                           random.nextInt(1, RANDOM_COUNT),
                                           colorSupplier.getRandomColor());
        int index = random.nextInt(figure.length);
        return figure[index];
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFULT_COLOR);
    }
}
