package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int MAX_VALUE = 20;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FIGURES_COUNT);
        switch (randomFigure) {
            case 0 :
                return getRandomSquare();
            case 1 :
                return getRandomCircle();
            case 2 :
                return getRandomIsoscelesTrapezoid();
            case 3 :
                return getRandomRectangle();
            default :
                return getRandomRightTriangle();
        }
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));

    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(
                colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(
                colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE));
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}

