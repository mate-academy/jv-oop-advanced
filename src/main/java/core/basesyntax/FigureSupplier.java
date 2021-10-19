package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_UNITS = 100;
    private static final int MIN_UNITS = 10;
    private static final int AMOUNT_FIGURES = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getDefault() {
        return new Circle(10, Colors.WHITE.toString());
    }

    public Figure getRandom() {
        String color = colorSupplier.getRandomColor();
        int randomIndex = random.nextInt(AMOUNT_FIGURES);
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
                return getRandomSquare(color);
            default:
                break;
        }
        return getRandomSquare(color);
    }

    private float getRandomUnits() {
        return (float)random.ints(1000, 10000)
                .findFirst()
                .getAsInt() / 100;
    }

    private Figure getRandomCircle(String color) {
        float side = getRandomUnits();
        return new Circle(side, color);
    }

    private Figure getRandomIsoscelesTrapezoid(String color) {
        float sideA = getRandomUnits();
        float sideB = getRandomUnits();
        float height = getRandomUnits();
        return new IsoscelesTrapezoid(sideA, sideB, height, color);
    }

    private Figure getRandomRectangle(String color) {
        float sideA = getRandomUnits();
        float sideB = getRandomUnits();
        return new Rectangle(sideA, sideB, color);
    }

    private Figure getRandomRightTriangle(String color) {
        float sideA = getRandomUnits();
        float sideB = getRandomUnits();
        return new RightTriangle(sideA, sideB, color);
    }

    private Figure getRandomSquare(String color) {
        float sideA = getRandomUnits();
        return new Square(color, sideA);
    }
}
