package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private Random random = new Random();
    private static final int RANDOM = 30;
    private ColorSupplier colorSupplier new ColorSupplier;

    public Figure getDefaultFigure() {
        Figure figure = new Circle(Color.WHITE, 10);
        return figure;
    }

    public Figure getRandomFigure() {
        switch (FigureType.valueOf(random.nextInt(FigureType.values().length))) {
            case FigureType.SQUARE:
                return getSquare();
            case FigureType.RECTANGLE:
                return getRectangle();
            case FigureType.RIGHT_TRIANGLE:
                return getRightTriangle();
            case FigureType.ISOSCELES_TRAPEZOID:
                return getIsoscelesTrapezoid();
            case FigureType.CIRCLE:
                return getCircle();
        }

    }

    private Figure getSquare() {
        Figure figure = new Square(colorSupplier.getRandomColor(), random.nextInt(RANDOM));
        return figure;
    }

    private Figure getRectangle() {
        Figure figure = new Rectangle(colorSupplier.getRandomColor(), random.nextInt(RANDOM), random.nextInt(RANDOM),
                random.nextInt(RANDOM) );
        return figure;
    }

    private Figure getRightTriangle() {
        Figure figure = new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(RANDOM),
                random.nextInt(RANDOM));
        return figure;
    }

    private Figure getCircle() {
        Figure figure = new Circle(colorSupplier.getRandomColor(), random.nextInt(RANDOM));
        return figure;
    }

    private Figure getIsoscelesTrapezoid() {
        Figure figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(RANDOM),
                random.nextInt(RANDOM), random.nextInt(RANDOM));
        return figure;
    }

}
