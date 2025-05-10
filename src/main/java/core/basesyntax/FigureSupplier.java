package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_SIZE = 42;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int FIGURES_AMOUNT = 5;
        int randomFigure = random.nextInt(FIGURES_AMOUNT);
        String randomColor = colorSupplier.getRandomColor();

        return switch (randomFigure) {
            case 0 -> createRandomCircle(randomColor);
            case 1 -> createRandomSquare(randomColor);
            case 2 -> createRandomRectangle(randomColor);
            case 3 -> createRandomRightTriangle(randomColor);
            case 4 -> createRandomIsoscelesTrapezoid(randomColor);
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        int DEFAULT_RADIUS = 10;

        return new Circle("white", DEFAULT_RADIUS);
    }

    private Circle createRandomCircle(String color) {
        double radius = random.nextDouble(MAX_RANDOM_SIZE);

        return new Circle(color, radius);
    }

    private Square createRandomSquare(String color) {
        double side = random.nextDouble(MAX_RANDOM_SIZE);

        return new Square(color, side);
    }

    private Rectangle createRandomRectangle(String color) {
        double firstSide = random.nextDouble(MAX_RANDOM_SIZE);
        double secondSide = random.nextDouble(MAX_RANDOM_SIZE);

        return new Rectangle(color, firstSide, secondSide);
    }

    private RightTriangle createRandomRightTriangle(String color) {
        double firstLeg = random.nextDouble(MAX_RANDOM_SIZE);
        double secondLeg = random.nextDouble(MAX_RANDOM_SIZE);
        double hypotenuse = random.nextDouble(MAX_RANDOM_SIZE);

        return new RightTriangle(color, firstLeg, secondLeg, hypotenuse);
    }

    private IsoscelesTrapezoid createRandomIsoscelesTrapezoid(String color) {
        double firstBase = random.nextDouble(MAX_RANDOM_SIZE);
        double secondBase = random.nextDouble(MAX_RANDOM_SIZE);
        double height = random.nextDouble(MAX_RANDOM_SIZE);

        return new IsoscelesTrapezoid(color, firstBase, secondBase, height);
    }
}
