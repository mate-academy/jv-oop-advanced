package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES = 5;
    private static final int RANDOM_NUMBERS = 100;

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int number = random.nextInt(FIGURES - 1) + 1;
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
        int radius = random.nextInt(RANDOM_NUMBERS - 1) + 1;
        String color = colorSupplier.setColor();

        return new Circle(radius, color);
    }

    private Square getNewSquare() {
        int sideA = random.nextInt(RANDOM_NUMBERS - 1) + 1;
        String color = colorSupplier.setColor();

        return new Square(sideA, color);
    }

    private RightTriangle getNewRightTriangle() {
        int hypotenuse = random.nextInt(RANDOM_NUMBERS - 1) + 1;
        int cathetusA = random.nextInt(RANDOM_NUMBERS - 1) + 1;
        int cathetusB = random.nextInt(RANDOM_NUMBERS - 1) + 1;
        String color = colorSupplier.setColor();

        return new RightTriangle(hypotenuse, cathetusA, cathetusB, color);
    }

    private IsoscelesTrapezoid getNewIsoscelesTrapezoid() {
        int height = random.nextInt(RANDOM_NUMBERS - 1) + 1;
        int sideA = random.nextInt(RANDOM_NUMBERS - 1) + 1;
        int sideB = random.nextInt(RANDOM_NUMBERS - 1) + 1;
        String color = colorSupplier.setColor();

        return new IsoscelesTrapezoid(height, sideA, sideB, color);
    }

    private Rectangle getNewRectangle() {
        int sideA = random.nextInt(RANDOM_NUMBERS - 1) + 1;
        int sideB = random.nextInt(RANDOM_NUMBERS - 1) + 1;
        String color = colorSupplier.setColor();

        return new Rectangle(sideA, sideB, color);
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public void setColorSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }
}
