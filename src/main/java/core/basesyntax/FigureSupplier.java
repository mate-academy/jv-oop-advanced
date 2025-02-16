package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIDE_LENGTH = 20; // Maximum side length for figures
    private static final int MAX_RADIUS = 10; // Maximum radius for circles
    private static final int MAX_HEIGHT = 15; // Maximum height for trapezoid
    private static final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        // 0: Square, 1: Rectangle, 2: RightTriangle, 3: Circle, 4: IsoscelesTrapezoid

        String color = ColorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return createRandomSquare(color);
            case 1:
                return createRandomRectangle(color);
            case 2:
                return createRandomRightTriangle(color);
            case 3:
                return createRandomCircle(color);
            case 4:
                return createRandomIsoscelesTrapezoid(color);
            default:
                throw new IllegalStateException("Invalid figure type generated");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }

    private Square createRandomSquare(String color) {
        int side = random.nextInt(MAX_SIDE_LENGTH) + 1;
        return new Square(color, side);
    }

    private Rectangle createRandomRectangle(String color) {
        int sideA = random.nextInt(MAX_SIDE_LENGTH) + 1;
        int sideB = random.nextInt(MAX_SIDE_LENGTH) + 1;
        return new Rectangle(color, sideA, sideB);
    }

    private RightTriangle createRandomRightTriangle(String color) {
        int firstLeg = random.nextInt(MAX_SIDE_LENGTH) + 1;
        int secondLeg = random.nextInt(MAX_SIDE_LENGTH) + 1;
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Circle createRandomCircle(String color) {
        int radius = random.nextInt(MAX_RADIUS) + 1;
        return new Circle(color, radius);
    }

    private IsoscelesTrapezoid createRandomIsoscelesTrapezoid(String color) {
        int baseA = random.nextInt(MAX_SIDE_LENGTH) + 1;
        int baseB = random.nextInt(MAX_SIDE_LENGTH) + 1;
        int height = random.nextInt(MAX_HEIGHT) + 1;
        return new IsoscelesTrapezoid(color, baseA, baseB, height);
    }
}
