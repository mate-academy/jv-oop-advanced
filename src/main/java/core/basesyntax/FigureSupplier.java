package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 100;
    private static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), "Circle", random.nextInt(BOUND));
    } //

    public Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), "Rectangle", random.nextInt(BOUND),
                random.nextInt(BOUND));
    }

    public Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), "Square", random.nextInt(BOUND));
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), "RightTriangle",
                random.nextInt(BOUND), random.nextInt(BOUND));
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), "IsoscelesTrapezoid",
                random.nextInt(BOUND), random.nextInt(BOUND), random.nextInt(BOUND));
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0: return getRandomCircle();
            case 1: return getRandomRectangle();
            case 2: return getRandomSquare();
            case 3: return getRandomRightTriangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", "Circle", 10);
    }
}
