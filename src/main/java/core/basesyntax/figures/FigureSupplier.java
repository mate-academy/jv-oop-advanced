package core.basesyntax.figures;

import core.basesyntax.color.ColorSuplier;
import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final int FIGURES = 5;
    private static final int MAX_SIZE = 99;
    private static final String defaultColor = "white";
    private static final int defaultRadius = 10;

    public Figure getRandomFigure() {
        return getFigure();
    }

    private Figure getFigure() {
        ColorSuplier colorSuplier = new ColorSuplier();
        int numberFigure = RANDOM.nextInt(FIGURES);
        String color = colorSuplier.getRandomColor();
        switch (numberFigure) {
            case 1:
                return getRandomCircle(MAX_SIZE, color);

            case 2:
                return getRandomSquare(MAX_SIZE, color);

            case 3:
                return getRandomRightTriangle(MAX_SIZE, color);

            case 4:
                return getRandomIsoscelesTrapezoid(MAX_SIZE, color);

            default:
                return getRandomCircle(MAX_SIZE, color);
        }
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid(int size, String color) {
        int top = RANDOM.nextInt(size) + 1;
        int down = RANDOM.nextInt(size) + 1;
        int altitude = RANDOM.nextInt(size) + 1;
        return new IsoscelesTrapezoid(color, top, down, altitude);
    }

    private RightTriangle getRandomRightTriangle(int maxSize, String color) {
        int firstLeg = RANDOM.nextInt(maxSize) + 1;
        int secondLeg = RANDOM.nextInt(maxSize) + 1;
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Square getRandomSquare(int size, String color) {
        int side = RANDOM.nextInt(size) + 1;
        return new Square(color, side);
    }

    private Circle getRandomCircle(int size, String color) {
        int radius = RANDOM.nextInt(size) + 1;
        return new Circle(color, radius);
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultColor, defaultRadius);
    }
}
