package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int QUANTITY_DIFFERENT_FIGURES = 4;
    private static final int MAX_RANDOM_VALUE = 111;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public FigureBase getRandomFigure() {
        int index = random.nextInt(QUANTITY_DIFFERENT_FIGURES);

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

    public FigureBase getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_CIRCLE_RADIUS);
    }

    private double getRandomValue() {
        return random.nextInt(MAX_RANDOM_VALUE);
    }

    private FigureBase getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomValue());
    }

    private FigureBase getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomValue(), getRandomValue());
    }

    private FigureBase getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomValue(), getRandomValue());
    }

    private FigureBase getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomValue(),
                getRandomValue(), getRandomValue());
    }

    private FigureBase getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomValue());
    }

}
