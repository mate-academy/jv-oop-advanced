package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0 : return getRandomSquare();
            case 1 : return getRandomRectangle();
            case 2 : return getRandomRightTriangle();
            case 3 : return getRandomCircle();
            case 4 : return getRandomIsoscelesTrapezoid();
            default: return getDefaultFigure();
        }
    }

    public Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(10) + 1);
    }

    public Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(10) + 1,
                random.nextInt(10) + 1);
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(10) + 1,
                random.nextInt(10) + 1);
    }

    public Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(10) + 1);
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(10) + 1,
                random.nextInt(10) + 1, random.nextInt(10) + 1);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString().toLowerCase(), 10);
    }
}
