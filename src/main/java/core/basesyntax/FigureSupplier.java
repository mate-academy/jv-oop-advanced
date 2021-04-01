package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBERS_OF_FIGURES = 5;
    private static final int MAX_RANDOM_NUMBERS = 100;

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int number = random.nextInt(MAX_NUMBERS_OF_FIGURES);
        switch (number) {
            case 1:
                return getNewSquare();
            case 2:
                return getNewCircle();
            case 3:
                return getNewRightTriangle();
            case 4:
                return getNewIsoscelesTrapezoid();
            default:
                return getNewRectangle();
        }
    }

    private Circle getNewCircle() {
        int radius = random.nextInt(MAX_RANDOM_NUMBERS);
        String color = colorSupplier.getRandomColor();

        return new Circle(radius, color);
    }

    private Square getNewSquare() {
        int sideOfSquare = random.nextInt(MAX_RANDOM_NUMBERS);
        String color = colorSupplier.getRandomColor();

        return new Square(sideOfSquare, color);
    }

    private RightTriangle getNewRightTriangle() {
        int hypotenuse = random.nextInt(MAX_RANDOM_NUMBERS);
        int firstLeg = random.nextInt(MAX_RANDOM_NUMBERS);
        int secondLeg = random.nextInt(MAX_RANDOM_NUMBERS);
        String color = colorSupplier.getRandomColor();

        return new RightTriangle(hypotenuse, firstLeg, secondLeg, color);
    }

    private IsoscelesTrapezoid getNewIsoscelesTrapezoid() {
        int height = random.nextInt(MAX_RANDOM_NUMBERS);
        int firstBase = random.nextInt(MAX_RANDOM_NUMBERS);
        int secondBase = random.nextInt(MAX_RANDOM_NUMBERS);
        String color = colorSupplier.getRandomColor();

        return new IsoscelesTrapezoid(height, firstBase, secondBase, color);
    }

    private Rectangle getNewRectangle() {
        int width = random.nextInt(MAX_RANDOM_NUMBERS);
        int length = random.nextInt(MAX_RANDOM_NUMBERS);
        String color = colorSupplier.getRandomColor();

        return new Rectangle(width, length, color);
    }
}
