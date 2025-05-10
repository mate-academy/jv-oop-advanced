package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int RANDOM_MAX_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigureNumber = random.nextInt(FIGURE_COUNT);

        switch (randomFigureNumber) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.BLACK.name(), DEFAULT_RADIUS);
    }

    private Circle getRandomCircle() {
        int randomRadius = getRandomNumber();
        return new Circle(colorSupplier.getRandomColor(), randomRadius);
    }

    private Square getRandomSquare() {
        int randomSide = getRandomNumber();
        return new Square(colorSupplier.getRandomColor(), randomSide);
    }

    private Rectangle getRandomRectangle() {
        int randomHeight = getRandomNumber();
        int randomWidth = getRandomNumber();
        return new Rectangle(colorSupplier.getRandomColor(), randomHeight, randomWidth);
    }

    private RightTriangle getRandomRightTriangle() {
        int randomFirstLeg = getRandomNumber();
        int randomSecondLeg = getRandomNumber();
        return new RightTriangle(colorSupplier.getRandomColor(), randomFirstLeg, randomSecondLeg);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int randomFirstSide = getRandomNumber();
        int randomSecondSide = getRandomNumber();
        int randomHeight = getRandomNumber();
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    randomFirstSide, randomSecondSide, randomHeight);
    }

    private int getRandomNumber() {
        return new Random().nextInt(RANDOM_MAX_NUMBER);
    }
}
