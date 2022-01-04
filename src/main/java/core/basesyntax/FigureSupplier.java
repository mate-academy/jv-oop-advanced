package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int MAX_SIZE = 50;
    private static final int FIGURE_COUNT = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        String color = Color.WHITE.toString();
        return new Circle(color, DEFAULT_CIRCLE_RADIUS);
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int randomIndex = random.nextInt(FIGURE_COUNT);
        switch (randomIndex) {
            case 0:
                return getRandomCircle(color);
            case 1:
                return getRandomIsoscelesTrapezoid(color);
            case 2:
                return getRandomRectangle(color);
            case 3:
                return getRandomRightTriangle(color);
            case 4:
            default:
                return getRandomSquare(color);
        }
    }

    private float getRandomUnits() {
        return new Random().nextInt(MAX_SIZE);
    }

    private Figure getRandomCircle(String color) {
        float side = getRandomUnits();
        return new Circle(color, side);
    }

    private Figure getRandomIsoscelesTrapezoid(String color) {
        float topSide = getRandomUnits();
        float downSide = getRandomUnits();
        float height = getRandomUnits();
        return new IsoscelesTrapezoid(color, topSide, downSide, height);
    }

    private Figure getRandomRectangle(String color) {
        float height = getRandomUnits();
        float width = getRandomUnits();
        return new Rectangle(color, height, width);
    }

    private Figure getRandomRightTriangle(String color) {
        float firstLeg = getRandomUnits();
        float secondLeg = getRandomUnits();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure getRandomSquare(String color) {
        float side = getRandomUnits();
        return new Square(color, side);
    }
}
