package core.basesyntax.figures;

import core.basesyntax.color.Color;
import core.basesyntax.color.ColorSuplier;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_QUANTITY = 5;
    private static final int MAX_SIZE = 99;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final int DEFAULT_RADIUS = 10;
    private static final ColorSuplier COLOR_SUPLIER = new ColorSuplier();
    private final Random RANDOM = new Random();

    public Figure getRandomFigure() {
        int numberFigure = RANDOM.nextInt(FIGURES_QUANTITY);
        String color = COLOR_SUPLIER.getRandomColor();
        switch (numberFigure) {
            case 1:
                return getRandomCircle(color);

            case 2:
                return getRandomSquare(color);

            case 3:
                return getRandomRightTriangle(color);

            case 4:
            default:
                return getRandomIsoscelesTrapezoid(color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int randomSize() {
        return RANDOM.nextInt(MAX_SIZE) + 1;
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid(String color) {
        int top = randomSize();
        int down = randomSize();
        int altitude = randomSize();
        return new IsoscelesTrapezoid(color, top, down, altitude);
    }

    private RightTriangle getRandomRightTriangle(String color) {
        int firstLeg = randomSize();
        int secondLeg = randomSize();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Square getRandomSquare(String color) {
        int side = randomSize();
        return new Square(color, side);
    }

    private Circle getRandomCircle(String color) {
        int radius = randomSize();
        return new Circle(color, radius);
    }
}
