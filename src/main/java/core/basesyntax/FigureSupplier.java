package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private static final int FIGURE_COUNT = 6;
    private static final int RANDOM_HEIGHT = 5;
    private static final int RANDOM_NUMBER = 21;

    public static int getFigureCount() {
        return FIGURE_COUNT;
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(5);
        Figure randomFigure;
        int randomNumber = random.nextInt(RANDOM_NUMBER);
        double randomDouble = randomNumber;
        int randomHeight = random.nextInt(RANDOM_HEIGHT);
        String color = colorSupplier.getRandomColor();

        switch (index) {
            case 0 -> randomFigure = new Circle(randomDouble, color);
            case 1 -> randomFigure = new Square(randomDouble, color);
            case 2 -> randomFigure = new Rectangle(randomDouble, randomDouble, color);
            case 3 -> randomFigure = new RightTriangle(randomDouble, randomDouble, color);
            case 4 -> randomFigure = new IsoscelesTrapezoid(randomDouble, randomDouble,
                    randomHeight, color);
            default -> randomFigure = new Circle(10, "WHITE");
        }

        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}
