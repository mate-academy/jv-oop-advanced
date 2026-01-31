package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURES = 5;
    public static final int MAX_RANDOM_VALUE = 10;
    public static final String DEFAULT_COLOR = "white";

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = random.nextInt(NUMBER_OF_FIGURES);
        String color = colorSupplier.getRandomColor();

        switch (type) {
            case 0:
                return new Square(color, random.nextInt(MAX_RANDOM_VALUE) + 1);
            case 1:
                return new Rectangle(color,
                        random.nextInt(MAX_RANDOM_VALUE) + 1,
                        random.nextInt(MAX_RANDOM_VALUE) + 1);
            case 2:
                return new RightTriangle(color,
                        random.nextInt(MAX_RANDOM_VALUE) + 1,
                        random.nextInt(MAX_RANDOM_VALUE) + 1);
            case 3:
                return new Circle(color, random.nextInt(MAX_RANDOM_VALUE) + 1);
            default:
                return new IsoscelesTrapezoid(color,
                        random.nextInt(MAX_RANDOM_VALUE) + 1,
                        random.nextInt(MAX_RANDOM_VALUE) + 1,
                        random.nextInt(MAX_RANDOM_VALUE) + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, 10);
    }
}
