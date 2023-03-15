package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int CIRCLE_RADIUS = 10;
    public static final int MAX_OF_BOUND = 40;
    public static final int FIGURES_NUMBER = 5;
    public static final String COLOR = "white";
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(FIGURES_NUMBER);
        switch (randomNumber) {
            case 0:
                return createCircle(colorSupplier.getRandomColor(), random.nextInt(MAX_OF_BOUND));
            case 1:
                return createIsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_OF_BOUND), random.nextInt(MAX_OF_BOUND),
                        random.nextInt(MAX_OF_BOUND));
            case 2:
                return createRectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_OF_BOUND), random.nextInt(MAX_OF_BOUND));
            case 3:
                return createRightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_OF_BOUND), random.nextInt(MAX_OF_BOUND));
            default:
                return createSquare(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_OF_BOUND));
        }
    }

    private Figure createSquare(String color, int side) {
        return new Square(color, side);
    }

    private Figure createRightTriangle(String color, int firstLeg, int secondLeg) {
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure createRectangle(String color, int firstSide, int secondSide) {
        return new Rectangle(color, firstSide, secondSide);
    }

    private Figure createIsoscelesTrapezoid(String color, int firstBase,
                                            int secondBase, int height) {
        return new IsoscelesTrapezoid(color, firstBase, secondBase, height);
    }

    private Figure createCircle(String color, int radius) {
        return new Circle(color, radius);
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR, CIRCLE_RADIUS);
    }
}
