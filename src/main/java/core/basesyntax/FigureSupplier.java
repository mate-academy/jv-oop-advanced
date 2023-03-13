package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_NUMBER = 10;
    private static final int RANDOM_FIGURE = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int randomFigure = random.nextInt(RANDOM_FIGURE);

        switch (randomFigure) {
            case 0:
                return new Circle(random.nextInt(RANDOM_NUMBER), randomColor);
            case 1:
                return new Rectangle(random.nextInt(RANDOM_NUMBER),
                        random.nextInt(RANDOM_NUMBER), randomColor);
            case 2:
                return new Square(random.nextInt(RANDOM_NUMBER), randomColor);
            case 3:
                return new IsoscelesTrapezoid(random.nextInt(RANDOM_NUMBER),
                        random.nextInt(RANDOM_NUMBER),
                        random.nextInt(RANDOM_NUMBER),
                        randomColor);
            case 4:
                return new RightTriangle(random.nextInt(), random.nextInt(), randomColor);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "White");
    }
}
