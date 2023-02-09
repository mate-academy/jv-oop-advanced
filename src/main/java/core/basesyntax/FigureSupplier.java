package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM = 30;
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        Figure figure = new Circle(Color.WHITE, 10);
        return figure;
    }

    public Figure getRandomFigure() {
        int randomize = random.nextInt(FIGURE_COUNT) + 1;
        switch (randomize) {
            case 1:
                return getSquare();
            case 2:
                return getRectangle();
            case 3:
                return getRightTriangle();
            case 4:
                return getIsoscelesTrapezoid();
            case 5:
                return getCircle();
            default:
                return null;
        }
    }

    private Figure getSquare() {
        Figure figure = new Square(colorSupplier.getRandomColor(), random.nextInt(RANDOM));
        return figure;
    }

    private Figure getRectangle() {
        Figure figure = new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(RANDOM), random.nextInt(RANDOM));
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
        Figure figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(RANDOM), random.nextInt(RANDOM), random.nextInt(RANDOM));
        return figure;
    }
}
