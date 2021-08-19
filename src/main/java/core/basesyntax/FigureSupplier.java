package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 100;
    private static final int MIN_SIZE = 1;
    private static final int FIGURES_NUMBER = 4;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Random random = new Random();
        String color = new ColorSupplier().getRandomColor();
        switch (random.nextInt(FIGURES_NUMBER)) {
            case 0:
                return new Rectangle(randomSize(), randomSize(), color);
            case 1:
                return new Circle(randomSize(), color);
            case 2:
                return new RightTriangle(randomSize(), randomSize(), color);
            case 3:
                return new IsoscelesTrapezoid(randomSize(), randomSize(), randomSize(), color);
            default:
                return new Square(randomSize(), color);
        }
    }

    private Figure createRectangle(String color) {
        int height = randomSize();
        int width = randomSize();
        return new Rectangle(height, width, color);
    }

    private Figure createCircle(String color) {
        int radius = randomSize();
        return new Circle(radius, color);
    }

    private Figure createRightTriangle(String color) {
        int firstLeg = randomSize();
        int secondLeg = randomSize();
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    private Figure createIsoscelesTrapezoid(String color) {
        int baseUp = randomSize();
        int baseDown = randomSize();
        int height = randomSize();
        return new IsoscelesTrapezoid(baseUp, baseDown, height, color);
    }

    private Figure createSquare(String color) {
        int side = randomSize();
        return new Square(side, color);
    }

    private int randomSize() {
        return random.nextInt(MAX_SIZE) + MIN_SIZE;
    }
}
