package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static int FIGURES_COUNT = 5;
    private static int DEFAULT_CIRCLE_RADIUS = 10;
    private static int MAX_RANDOM_SIDE = 10;
    private static String DEFAULT_CIRCLE_COLOR = "white";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int choice = random.nextInt(FIGURES_COUNT);

        switch (choice) {
            case 0:
                return new Square(getRandomSide(), randomColor);
            case 1:
                return new Rectangle(getRandomSide(), getRandomSide(), randomColor);
            case 2:
                return new RightTriangle(getRandomSide(), getRandomSide(), randomColor);
            case 3:
                return new IsoscelesTrapezoid(getRandomSide(), getRandomSide(),
                        getRandomSide(), randomColor);
            case 4:
            default:
                return getDefaultFigure();
        }
    }

    private int getRandomSide() {
        return random.nextInt(MAX_RANDOM_SIDE) + 1;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, DEFAULT_CIRCLE_COLOR);
    }
}
