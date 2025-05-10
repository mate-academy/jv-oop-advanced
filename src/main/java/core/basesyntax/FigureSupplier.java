package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.valueOf(DEFAULT_COLOR), DEFAULT_RADIUS);
    }

    private Square getRandomSquare() {
        return new Square(Color.valueOf(colorSupplier.getRandomColor()), random.nextInt());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(Color.valueOf(colorSupplier.getRandomColor()),
                random.nextInt(), random.nextInt());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(Color.valueOf(colorSupplier.getRandomColor()),
                random.nextInt(), random.nextInt());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(Color.valueOf(colorSupplier.getRandomColor()),
                random.nextInt(), random.nextInt(), random.nextInt());
    }

    private Circle getRandomCircle() {
        return new Circle(Color.valueOf(colorSupplier.getRandomColor()), random.nextInt());
    }
}
