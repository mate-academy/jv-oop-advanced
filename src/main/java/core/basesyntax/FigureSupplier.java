package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private static final int UPPER_BOUND = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String color = colorSupplier.getRandomColor();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(NUMBER_OF_FIGURES);
        switch (figureNumber) {
            case 0:
                return new Square(color, random.nextInt(UPPER_BOUND));
            case 1:
                return new RightTriangle(color,
                        random.nextInt(UPPER_BOUND),
                        random.nextInt(UPPER_BOUND));
            case 2:
                return new Rectangle(color,
                        random.nextInt(UPPER_BOUND),
                        random.nextInt(UPPER_BOUND));
            case 3:
                return new IsoscelesTrapezoid(color,
                        random.nextInt(UPPER_BOUND),
                        random.nextInt(UPPER_BOUND),
                        random.nextInt(UPPER_BOUND));
            default:
                return new Circle(color, UPPER_BOUND);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(color, random.nextInt(UPPER_BOUND));
    }
}
