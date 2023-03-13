package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_RADIUS = 5;
    public static final int MAX_NUMBER = 30;
    public static final int AMOUNT_FIGURE = 5;
    public static final String COLOR_CIRCLE = Color.WHITE.name();
    private Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        switch (random.nextInt(AMOUNT_FIGURE)) {
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                return getRandomCircle();

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR_CIRCLE.toString(), DEFAULT_RADIUS);
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_NUMBER));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_NUMBER),
                random.nextInt(MAX_NUMBER),
                random.nextInt(MAX_NUMBER));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_NUMBER),
                random.nextInt(MAX_NUMBER));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_NUMBER),
                random.nextInt(MAX_NUMBER));
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_NUMBER));
    }
}

