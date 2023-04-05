package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_RADIUS = 10;

    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    private Figure createRandomSquare() {
        return new Square(randomColor.getRandomColor(), random.nextInt(101));
    }

    private Figure createRandomRectangle() {
        return new Rectangle(randomColor.getRandomColor(),
                random.nextInt(101), random.nextInt(101));
    }

    private Figure createRandomRightTriangle() {
        return new RightTriangle(randomColor.getRandomColor(),
                random.nextInt(101), random.nextInt(101));
    }

    private Figure createRandomCircle() {
        return new Circle(randomColor.getRandomColor(), random.nextInt(101));
    }

    private Figure createRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(randomColor.getRandomColor(), random.nextInt(101),
                random.nextInt(101), random.nextInt(101));
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT + 1);
        switch (figureNumber) {
            case 1:
                return createRandomSquare();
            case 2:
                return createRandomRectangle();
            case 3:
                return createRandomRightTriangle();
            case 4:
                return createRandomCircle();
            case 5:
                return createRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }
}
