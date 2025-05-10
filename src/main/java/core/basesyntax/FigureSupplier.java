package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_AMOUNT = 5;
    private static final int MAX_PARAMETER = 100;
    private static final double DEFAULT_RADIUS = 10;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_AMOUNT);
        switch (index) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomIsoscelesTrapezoid();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomSquare();
        }
    }

    private Circle getRandomCircle() {
        int randomRadius = random.nextInt(MAX_PARAMETER);
        return new Circle(colorSupplier.getRandomColor(), randomRadius);
    }

    private Rectangle getRandomRectangle() {
        int randomLength = random.nextInt(MAX_PARAMETER);
        int randomWidth = random.nextInt(MAX_PARAMETER);
        return new Rectangle(colorSupplier.getRandomColor(), randomLength, randomWidth);
    }

    private Square getRandomSquare() {
        int randomSide = random.nextInt(MAX_PARAMETER);
        return new Square(colorSupplier.getRandomColor(), randomSide);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int randomHigh = random.nextInt(MAX_PARAMETER);
        int randomLowerBase = random.nextInt(MAX_PARAMETER);
        int randomUpperBase = random.nextInt(MAX_PARAMETER);
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                randomHigh, randomUpperBase, randomLowerBase);
    }

    private RightTriangle getRandomRightTriangle() {
        int randomFirstLeg = random.nextInt(MAX_PARAMETER);
        int randomSecondLeg = random.nextInt(MAX_PARAMETER);
        return new RightTriangle(colorSupplier.getRandomColor(), randomFirstLeg, randomSecondLeg);
    }
}
