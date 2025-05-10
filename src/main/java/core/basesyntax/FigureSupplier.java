package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int FIGURE_UNITS = 10;
    private static final int DEFAULT_UNITS = 5;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getUnits());
    }

    public Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getUnits());
    }

    public Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getUnits(), getUnits());
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getUnits(), getUnits());
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getUnits(), getUnits(), getUnits());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_UNITS);
    }

    public int getUnits() {
        return random.nextInt(FIGURE_UNITS) + 1;
    }

}
