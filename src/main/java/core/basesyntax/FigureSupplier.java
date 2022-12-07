package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final double DEFAULT_RADIUS = 10.00;
    private static final int MAX_SIDE_LENGTH = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR,DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int figureIndex = new Random().nextInt(NUMBER_OF_FIGURES);
        switch (figureIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomSquare();
            case 4:
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    private int getRandomSide() {
        return random.nextInt(MAX_SIDE_LENGTH);
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomSide());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomSide(), getRandomSide());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomSide(), getRandomSide());
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomSide());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomSide(), getRandomSide(), getRandomSide());
    }
}
