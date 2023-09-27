package core.basesyntax.model;

import core.basesyntax.enums.AvailableFigure;
import core.basesyntax.enums.Color;
import java.util.Random;

public class FigureSupplier {

    private static final String DEFAULT_COLOR = Color.WHITE.getColor();
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_SIDE_UNITS_NUMBER = 100;
    private static final int MIN_SIDE_UNITS_NUMBER = 1;
    private final AvailableFigure[] availableFigures = AvailableFigure.values();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        switch (availableFigures[random.nextInt(availableFigures.length)]) {
            case CIRCLE:
                return getRandomCircle();
            case SQUARE:
                return getRandomSquare();
            case RECTANGLE:
                return getRandomRectangle();
            case RIGHT_TRIANGLE:
                return getRandomRightTriangle();
            case ISOSCELES_TRAPEZOID:
                return getIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int radius = random.nextInt(MAX_SIDE_UNITS_NUMBER) + MIN_SIDE_UNITS_NUMBER;
        return new Circle(color, radius);
    }

    private Figure getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int side = random.nextInt(MAX_SIDE_UNITS_NUMBER) + MIN_SIDE_UNITS_NUMBER;
        return new Square(color, side);
    }

    private Figure getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int width = random.nextInt(MAX_SIDE_UNITS_NUMBER) + MIN_SIDE_UNITS_NUMBER;
        int height = generateUnequalInt(width);
        return new Rectangle(color, width, height);
    }

    private Figure getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int legHeight = random.nextInt(MAX_SIDE_UNITS_NUMBER) + MIN_SIDE_UNITS_NUMBER;
        int legBase = generateUnequalInt(legHeight);
        double hypotenuse = Math.round(Math.sqrt((legBase * legBase + legHeight * legHeight)));
        return new RightTriangle(color, hypotenuse, legHeight, legBase);
    }

    private Figure getIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int firstBase = random.nextInt(MAX_SIDE_UNITS_NUMBER) + MIN_SIDE_UNITS_NUMBER;
        int secondBase = generateUnequalInt(firstBase);
        int shortBase = Math.min(firstBase, secondBase);
        int longBase = Math.max(firstBase, secondBase);
        int leg = random.nextInt(MAX_SIDE_UNITS_NUMBER) + MIN_SIDE_UNITS_NUMBER;
        return new IsoscelesTrapezoid(color, leg, shortBase, longBase);
    }

    private int generateUnequalInt(int number) {
        int unequalInt;
        do {
            unequalInt = random.nextInt(MAX_SIDE_UNITS_NUMBER) + MIN_SIDE_UNITS_NUMBER;
        } while (unequalInt == number);
        return unequalInt;
    }
}
