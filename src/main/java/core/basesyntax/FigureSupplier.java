package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND_NUMBER = 50;
    private static final int FIGURES_NUMBER = 4;
    private static final String DEFAULT_COLOR = Color.WHITE.toString().toLowerCase();
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURES_NUMBER);
        switch (figureNumber) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            default:
                return getRandomCircle();
        }
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(BOUND_NUMBER));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(BOUND_NUMBER), random.nextInt(BOUND_NUMBER));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(BOUND_NUMBER), random.nextInt(BOUND_NUMBER));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(BOUND_NUMBER), random.nextInt(BOUND_NUMBER),
                random.nextInt(BOUND_NUMBER));
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(BOUND_NUMBER));
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

}

