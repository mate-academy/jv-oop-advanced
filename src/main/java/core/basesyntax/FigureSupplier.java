package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 5;
    private static final int MAX_VALUE = 100;
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure;
        int index = random.nextInt(BOUND);
        switch (index) {
            case 0:
                figure = toGetCircle();
                break;
            case 1:
                figure = toGetIsoscelesTrapezoid();
                break;
            case 2:
                figure = toGetSquare();
                break;
            case 3:
                figure = toGetRightTriangle();
                break;
            default:
                figure = toGetRectangle();
        }
        return figure;
    }

    private int getInt() {
        return random.nextInt(MAX_VALUE) + 1;
    }

    private String getColor() {
        return colorSupplier.getRandomColor();
    }

    private Figure toGetCircle() {
        return new Circle(getColor(), getInt());
    }

    private Figure toGetIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(getColor(), getInt(), getInt(), getInt());
    }

    private Figure toGetRectangle() {
        return new Rectangle(getColor(), getInt(), getInt());
    }

    private Figure toGetRightTriangle() {
        return new RightTriangle(getColor(), getInt(), getInt());
    }

    private Figure toGetSquare() {
        return new Square(getColor(), getInt());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
