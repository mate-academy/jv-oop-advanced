package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 4;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_RANDOM_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigureNumber = random.nextInt(FIGURE_COUNT);
        switch (randomFigureNumber) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomTrapezoid();
            case 3:
            default:
                return getRandomTriangle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.getName());
    }

    private RightTriangle getRandomTriangle() {
        String randomColor = colorSupplier.getRandomColor();
        int randomFirstLeg = getRandomNumber();
        int randomSecondLeg = getRandomNumber();
        return new RightTriangle(randomFirstLeg, randomSecondLeg, randomColor);
    }

    private Circle getRandomCircle() {
        String randomColor = colorSupplier.getRandomColor();
        int randomRadius = getRandomNumber();
        return new Circle(randomRadius, colorSupplier.getRandomColor());
    }

    private IsoscelesTrapezoid getRandomTrapezoid() {
        String randomColor = colorSupplier.getRandomColor();
        int randomFirstSide = getRandomNumber();
        int randomSecondSide = getRandomNumber();
        int randomHeight = getRandomNumber();
        return new IsoscelesTrapezoid(randomHeight, randomFirstSide,
                randomSecondSide, colorSupplier.getRandomColor());
    }

    private Square getRandomSquare() {
        String randomColor = colorSupplier.getRandomColor();
        int side = getRandomNumber();
        return new Square(side,colorSupplier.getRandomColor());
    }

    private int getRandomNumber() {
        return new Random().nextInt(MAX_RANDOM_NUMBER);
    }
}
