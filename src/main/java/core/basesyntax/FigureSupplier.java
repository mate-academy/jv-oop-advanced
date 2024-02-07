package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_ELEMENT_MAX_SIZE = 100;
    private static final int FIGURE_NUMBER = 5;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_NUMBER)) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    private Figure getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int side = getRandomLength();
        return new Square(color, side);
    }

    private Figure getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int firstSide = getRandomLength();
        int secondSide = getRandomLength();
        return new Rectangle(color, firstSide, secondSide);
    }

    private Figure getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int firstLeg = getRandomLength();
        int secondLeg = getRandomLength();
        return new RightTriangle(color,firstLeg, secondLeg);
    }

    private Figure getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int radius = getRandomLength();
        return new Circle(color, radius);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int firstBase = getRandomLength();
        int secondBase = getRandomLength();
        int limit = Math.abs(firstBase - secondBase) / 2;
        int leg = random.nextInt(FIGURE_ELEMENT_MAX_SIZE - limit) + limit;
        return new IsoscelesTrapezoid(color, firstBase, secondBase, leg);
    }

    private int getRandomLength() {
        return random.nextInt(FIGURE_ELEMENT_MAX_SIZE) + 1;
    }
}
