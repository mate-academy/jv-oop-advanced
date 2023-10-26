package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_PROPERTIES_VALUE = 100;
    private static final int MAX_FIGURES_NUMBER = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;

    private Random random = new Random();

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(MAX_FIGURES_NUMBER);
        switch (index) {
            case 0:
                return createRandomSquare();
            case 1:
                return createRandomCircle();
            case 2:
                return createRandomIsoscelesTrapezoid();
            case 3:
                return createRandomRightTriangle();
            case 4:
                return createRandomRectangle();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Square createRandomSquare() {
        Color color = colorSupplier.getRandomColor();
        int side = random.nextInt(MAX_PROPERTIES_VALUE);
        return new Square(color, side);
    }

    private Circle createRandomCircle() {
        Color color = colorSupplier.getRandomColor();
        int radius = random.nextInt(MAX_PROPERTIES_VALUE);
        return new Circle(color, radius);
    }

    private IsoscelesTrapezoid createRandomIsoscelesTrapezoid() {
        Color color = colorSupplier.getRandomColor();
        int lowerBase = random.nextInt(MAX_PROPERTIES_VALUE);
        int upperBase = random.nextInt(MAX_PROPERTIES_VALUE);
        int side = random.nextInt(MAX_PROPERTIES_VALUE);
        return new IsoscelesTrapezoid(color, lowerBase, upperBase, side);
    }

    private Rectangle createRandomRectangle() {
        Color color = colorSupplier.getRandomColor();
        int firstSide = random.nextInt(MAX_PROPERTIES_VALUE);
        int secondSide = random.nextInt(MAX_PROPERTIES_VALUE);
        return new Rectangle(color, firstSide, secondSide);
    }

    private RightTriangle createRandomRightTriangle() {
        Color color = colorSupplier.getRandomColor();
        int firstLeg = random.nextInt(MAX_PROPERTIES_VALUE);
        int secondLeg = random.nextInt(MAX_PROPERTIES_VALUE);
        return new RightTriangle(color, firstLeg, secondLeg);
    }
}
