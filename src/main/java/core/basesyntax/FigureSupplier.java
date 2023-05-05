package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int MAX_NUMBER = 30;
    private static final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        switch (random.nextInt(FIGURES_COUNT)) {
            case 0:
                return createRandomSquare();
            case 1:
                return createRandomCircle();
            case 2:
                return createRandomIsoscelesTrapezoid();
            case 3:
                return createRandomRectangle();
            default:
                return createRandomRightTriangle();

        }

    }

    public Square createRandomSquare() {

        return new Square(colorSupplier.getRandomColor(),
        random.nextInt(MAX_NUMBER));
    }

    public Circle createRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
        random.nextInt(MAX_NUMBER));
    }

    public RightTriangle createRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
        random.nextInt(MAX_NUMBER),
        random.nextInt(MAX_NUMBER));
    }

    public IsoscelesTrapezoid createRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
        random.nextInt(MAX_NUMBER),
        random.nextInt(MAX_NUMBER),
        random.nextInt(MAX_NUMBER));
    }

    public Rectangle createRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
        random.nextInt(MAX_NUMBER),
        random.nextInt(MAX_NUMBER));
    }

    public Figure createDefaultFigure() {
        return new Circle(Color.WHITE.name(),10);
    }
}
