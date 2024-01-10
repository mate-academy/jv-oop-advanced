package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int COUNT_OF_FIGURES = 4;
    private static final int RANDOM_SIDE = 20;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(COUNT_OF_FIGURES);
        switch (randomNumber) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomIsoscelesTrapezoid();
            default:
                return getRandomRightTriangle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Circle getRandomCircle() {
        return new Circle(randomColor(), getRandomSide());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(randomColor(), getRandomSide(), getRandomSide());
    }

    private Square getRandomSquare() {
        return new Square(randomColor(), getRandomSide());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(randomColor(),
                getRandomSide(), getRandomSide(), getRandomSide());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(randomColor(), getRandomSide(), getRandomSide());
    }

    private String randomColor() {
        return color.getRandomColor();
    }

    private int getRandomSide() {
        return random.nextInt(RANDOM_SIDE);
    }
}

