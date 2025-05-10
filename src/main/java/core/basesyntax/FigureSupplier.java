package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURES_AMOUNT = 5;
    private static final int MAX_PROPERTY_LENGTH = 41;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURES_AMOUNT);
        switch (index) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getRandomCircle() {
        return new Circle(getMyRandomColor(), getMyRandomParameter());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(getMyRandomColor(), getMyRandomParameter(),
                getMyRandomParameter(), getMyRandomParameter());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(getMyRandomColor(), getMyRandomParameter(), getMyRandomParameter());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(getMyRandomColor(), getMyRandomParameter(),
                getMyRandomParameter());
    }

    private Figure getRandomSquare() {
        return new Square(getMyRandomColor(), getMyRandomParameter());
    }

    private Color getMyRandomColor() {
        return colorSupplier.getRandomColor();
    }

    private int getMyRandomParameter() {
        return random.nextInt(MAX_PROPERTY_LENGTH);
    }
}
