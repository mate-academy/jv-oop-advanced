package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();
    private final int MAXIMUM_SIDE = 50;
    private final int RADIUS = 10;
    private final int FIGURE_COUNT = 5;

    private Figure getRandomCircle() {
        return new Circle(random.nextInt(MAXIMUM_SIDE), randomColor.getRandomColor());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(MAXIMUM_SIDE),
                random.nextInt(MAXIMUM_SIDE), random.nextInt(MAXIMUM_SIDE),
                randomColor.getRandomColor());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(MAXIMUM_SIDE),
                random.nextInt(MAXIMUM_SIDE), randomColor.getRandomColor());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(random.nextInt(MAXIMUM_SIDE), random.nextInt(MAXIMUM_SIDE),
                randomColor.getRandomColor());
    }

    private Figure getRandomSquare() {
        return new Square(random.nextInt(MAXIMUM_SIDE), randomColor.getRandomColor());
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomSquare();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(RADIUS, Color.WHITE);
    }
}
