package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_TYPES_QUANTITY = 5;
    private static final int MAX_RANDOM_OF_FIGURES_PARAMETERS = 100;
    private static final String DEFAULT_COLOR = Colors.WHITE.name().toLowerCase();
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURES_TYPES_QUANTITY) + 1;
        String randomColor = new ColorSupplier().getRandomColor();
        switch (index) {
            case 1:
                return new Circle(randomColor,
                        random.nextInt(MAX_RANDOM_OF_FIGURES_PARAMETERS + 1));
            case 2:
                return new Square(randomColor,
                        random.nextInt(MAX_RANDOM_OF_FIGURES_PARAMETERS + 1));
            case 3:
                return new Rectangle(randomColor,
                        random.nextInt(MAX_RANDOM_OF_FIGURES_PARAMETERS + 1),
                        random.nextInt(MAX_RANDOM_OF_FIGURES_PARAMETERS + 1));
            case 4:
                return new RightTriangle(randomColor,
                        random.nextInt(MAX_RANDOM_OF_FIGURES_PARAMETERS + 1),
                        random.nextInt(MAX_RANDOM_OF_FIGURES_PARAMETERS + 1));
            default:
                return new IsoscelesTrapezoid(randomColor,
                        random.nextInt(MAX_RANDOM_OF_FIGURES_PARAMETERS + 1),
                        random.nextInt(MAX_RANDOM_OF_FIGURES_PARAMETERS + 1),
                        random.nextInt(MAX_RANDOM_OF_FIGURES_PARAMETERS + 1));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
