package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 20;
    private static final int FIGURES_NUMBER = 5;
    private static final int DEFAULT_RADIUS_CIRCLE = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURES_NUMBER);
        switch (index) {
            case 0:
                return getRandomRectangle();
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomIsoscelesTrapezoid();
            case 4:
                return getRandomRightTriangle();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS_CIRCLE);
    }

    private Circle getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int radius = random.nextInt(MAX_RANDOM_NUMBER);
        return new Circle(color, radius);
    }

    private Rectangle getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int shortSide = random.nextInt(MAX_RANDOM_NUMBER);
        int longSide = random.nextInt(MAX_RANDOM_NUMBER);
        return new Rectangle(color, shortSide, longSide);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int topSide = random.nextInt(MAX_RANDOM_NUMBER);
        int longSide = random.nextInt(MAX_RANDOM_NUMBER);
        int height = random.nextInt(MAX_RANDOM_NUMBER);
        return new IsoscelesTrapezoid(color, topSide, longSide, height);
    }

    private RightTriangle getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int firstLeg = random.nextInt(MAX_RANDOM_NUMBER);
        int secondLeg = random.nextInt(MAX_RANDOM_NUMBER);
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Square getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int side = random.nextInt(MAX_RANDOM_NUMBER);
        return new Square(color, side);
    }

}
