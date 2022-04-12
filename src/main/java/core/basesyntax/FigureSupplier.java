package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_NUMBER = 5;
    private static final int MAX_RANDOM_NUMBER = 10;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURES_NUMBER)) {
            case 0 :
                return new Square(random.nextInt(MAX_RANDOM_NUMBER) + 1,
                                        color.getRandomColor());
            case 1 :
                return new Rectangle(random.nextInt(MAX_RANDOM_NUMBER) + 1,
                                     random.nextInt(MAX_RANDOM_NUMBER) + 1,
                                            color.getRandomColor());
            case 2 :
                return new RightTriangle(random.nextInt(MAX_RANDOM_NUMBER) + 1,
                                         random.nextInt(MAX_RANDOM_NUMBER) + 1,
                                               color.getRandomColor());
            case 3 :
                return new Circle(random.nextInt(MAX_RANDOM_NUMBER) + 1,
                                                color.getRandomColor());
            default :
                return new IsoscelesTrapezoid(random.nextInt(MAX_RANDOM_NUMBER) + 1,
                                            random.nextInt(MAX_RANDOM_NUMBER) + 1,
                                                random.nextInt(MAX_RANDOM_NUMBER) + 1,
                                                        color.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, Color.WHITE.name());
    }
}
