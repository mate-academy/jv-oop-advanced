package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_SIDE_VALUE = 50;
    private static final int DEFAULT_VALUE = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(NUMBER_OF_FIGURES);
        switch (randomFigure) {
            case 0:
                return getSquare();
            case 1:
                return getCircle();
            case 2:
                return getRectangle();
            case 3:
                return getRightTriangle();
            default:
                return getIsoscelesTrapezoid();
        }
    }

    public Figure defaultFigure() {
        return new Circle(Color.WHITE.toString(),
                DEFAULT_VALUE);
    }

    public Square getSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIDE_VALUE));
    }

    public Circle getCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIDE_VALUE));
    }

    public Rectangle getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIDE_VALUE),
                random.nextInt(MAX_SIDE_VALUE));
    }

    public RightTriangle getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIDE_VALUE),
                random.nextInt(MAX_SIDE_VALUE));
    }

    public IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIDE_VALUE),
                random.nextInt(MAX_SIDE_VALUE),
                random.nextInt(MAX_SIDE_VALUE));
    }
}
