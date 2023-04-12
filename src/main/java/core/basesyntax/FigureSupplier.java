package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final int MAX_VALUE = 100;
    private static final String DEF_COLOR = "WHITE";
    private static final int DEF_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(DEF_COLOR, DEF_RADIUS);
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomCircle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE + 1),
                random.nextInt(MAX_VALUE));
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }
}
