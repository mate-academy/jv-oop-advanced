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
                int radius = random.nextInt(MAX_RANDOM_OF_FIGURES_PARAMETERS) + 1;
                return new Circle(randomColor, radius);
            case 2:
                int side = random.nextInt(MAX_RANDOM_OF_FIGURES_PARAMETERS) + 1;
                return new Square(randomColor, side);
            case 3:
                int rectangleHeight = random.nextInt(MAX_RANDOM_OF_FIGURES_PARAMETERS) + 1;
                int rectangleWidth = random.nextInt(MAX_RANDOM_OF_FIGURES_PARAMETERS) + 1;
                return new Rectangle(randomColor, rectangleHeight, rectangleWidth);
            case 4:
                int firstLeg = random.nextInt(MAX_RANDOM_OF_FIGURES_PARAMETERS) + 1;
                int secondLeg = random.nextInt(MAX_RANDOM_OF_FIGURES_PARAMETERS) + 1;
                return new RightTriangle(randomColor, firstLeg, secondLeg);
            default:
                int firstBaseSide = random.nextInt(MAX_RANDOM_OF_FIGURES_PARAMETERS) + 1;
                int secondBaseSide = random.nextInt(MAX_RANDOM_OF_FIGURES_PARAMETERS) + 1;
                int isoscelesTrapezoidHeight = random.nextInt(MAX_RANDOM_OF_FIGURES_PARAMETERS) + 1;
                return new IsoscelesTrapezoid(randomColor, firstBaseSide, secondBaseSide,
                        isoscelesTrapezoidHeight);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
