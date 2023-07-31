package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int UNITS_TEN = 10;
    private static final int UNITS_MAX_VALUE = 100;
    private final String[] availableFigures = {"Square", "Rectangle", "RightTriangle",
            "Circle", "IsoscelesTrapezoid"};
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(final Random random, final ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(availableFigures.length);
        String figureToCreate = availableFigures[index];
        switch (figureToCreate) {
            case "Square":
                return getSquare();
            case "Rectangle":
                return getRectangle();
            case "RightTriangle":
                break;
            case "Circle":
                return getCircle();
            case "IsoscelesTrapezoid":
                return getIsoscelesTrapezoid();
            default:
                throw new RuntimeException("Unknown figure!");
        }
        return null;
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(UNITS_MAX_VALUE), random.nextInt(UNITS_MAX_VALUE),
                random.nextInt(UNITS_MAX_VALUE));
    }

    private Circle getCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(UNITS_MAX_VALUE));
    }

    private Rectangle getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(UNITS_MAX_VALUE),
                random.nextInt(UNITS_MAX_VALUE));
    }

    private Square getSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(UNITS_MAX_VALUE));
    }

    public Figure getDefaultFigure() {
        return new Circle(ColorSupplier.COLOR_WHITE, UNITS_TEN);
    }
}
