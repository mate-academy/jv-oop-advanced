package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int FIGURES_NUMBER = 5;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURES_NUMBER);
        switch (index) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomIsoscelesTrapezoid();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomRectangle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }

    private Circle getRandomCircle() {
        int randomRadius = random.nextInt(MAX_RANDOM_NUMBER);
        return new Circle(colorSupplier.getRandomColor(), randomRadius);
    }

    private Square getRandomSquare() {
        int randomSide = random.nextInt(MAX_RANDOM_NUMBER);
        return new Square(colorSupplier.getRandomColor(), randomSide);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int randomHigh = random.nextInt(MAX_RANDOM_NUMBER);
        int randomLowerBase = random.nextInt(MAX_RANDOM_NUMBER);
        int randomUpperBase = random.nextInt(MAX_RANDOM_NUMBER);
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                randomHigh, randomLowerBase, randomUpperBase);
    }

    private RightTriangle getRandomRightTriangle() {
        int randomFirstLeg = random.nextInt(MAX_RANDOM_NUMBER);
        int randomSecondLeg = random.nextInt(MAX_RANDOM_NUMBER);
        return new RightTriangle(colorSupplier.getRandomColor(), randomFirstLeg, randomSecondLeg);
    }

    private Rectangle getRandomRectangle() {
        int randomWidth = random.nextInt(MAX_RANDOM_NUMBER);
        int randomHeight = random.nextInt(MAX_RANDOM_NUMBER);
        return new Rectangle(colorSupplier.getRandomColor(), randomWidth, randomHeight);
    }
}
