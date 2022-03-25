package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int MAX_NUMBER = 100;
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = new Random().nextInt(FIGURE_COUNT);
        switch (index) {
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomCircle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomRectangle();
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.name());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int randomUpperBase = random.nextInt(MAX_NUMBER);
        int randomLowerBase = random.nextInt(MAX_NUMBER);
        int randomHeight = random.nextInt(MAX_NUMBER);
        return new IsoscelesTrapezoid(randomUpperBase, randomLowerBase, randomHeight,
                colorSupplier.getRandomColor());
    }

    private Circle getRandomCircle() {
        int randomRadius = random.nextInt(MAX_NUMBER);
        return new Circle(randomRadius,colorSupplier.getRandomColor());
    }

    private RightTriangle getRandomRightTriangle() {
        int randomFirstLeg = random.nextInt(MAX_NUMBER);
        int randomSecondLeg = random.nextInt(MAX_NUMBER);
        return new RightTriangle(randomFirstLeg, randomSecondLeg, colorSupplier.getRandomColor());
    }

    private Rectangle getRandomRectangle() {
        int randomLength = random.nextInt(MAX_NUMBER);
        int randomWidth = random.nextInt(MAX_NUMBER);
        return new Rectangle(randomLength, randomWidth, colorSupplier.getRandomColor());
    }

    private Square getRandomSquare() {
        int randomSide = random.nextInt(MAX_NUMBER);
        return new Square(randomSide, colorSupplier.getRandomColor());
    }

}
