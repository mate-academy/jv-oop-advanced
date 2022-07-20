package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int maxSizeValue = 50;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier(random);

    public Figure getRandomFigure() {
        switch (Figures.values()[random.nextInt(Figures.values().length)]) {
            case CIRCLE:
                return getCircle();
            case SQUARE:
                return getSquare();
            case RECTANGLE:
                return getRectangle();
            case RIGHTTRIANGLE:
                return getRightTriangle();
            default:
                return getIsoscelesTrapezoid();

        }

    }

    public Circle getCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(maxSizeValue));
    }

    public Square getSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(maxSizeValue));
    }

    public Rectangle getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(maxSizeValue),
                random.nextInt(maxSizeValue));
    }

    public RightTriangle getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(maxSizeValue),
                random.nextInt(maxSizeValue));
    }

    public IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(maxSizeValue),
                random.nextInt(maxSizeValue), random.nextInt(maxSizeValue));
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
