package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    protected static final int MAX_SIZE_VARIABLE = 10;
    private static final int FIGURES_COUNT = 5;
    private static final int DEFAULT_VALUE = 10;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURES_COUNT);
        switch (figureIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_VALUE);
    }

    public Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIZE_VARIABLE));
    }

    public Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIZE_VARIABLE));
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIZE_VARIABLE),
                random.nextInt(MAX_SIZE_VARIABLE));
    }

    public RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIZE_VARIABLE),
                random.nextInt(MAX_SIZE_VARIABLE));
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIZE_VARIABLE),
                random.nextInt(MAX_SIZE_VARIABLE),
                random.nextInt(MAX_SIZE_VARIABLE));
    }
}
