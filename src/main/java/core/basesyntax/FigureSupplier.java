package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int bound = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(bound));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),random.nextInt(bound),
                random.nextInt(bound));
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),random.nextInt(bound));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),random.nextInt(bound),
                random.nextInt(bound));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),random.nextInt(bound),
                random.nextInt(bound), random.nextInt(bound));
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0: return getRandomCircle();
            case 1: return getRandomRectangle();
            case 2: return getRandomSquare();
            case 3: return getRandomRightTriangle();
            case 4: return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
