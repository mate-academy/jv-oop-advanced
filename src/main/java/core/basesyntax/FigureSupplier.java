package core.basesyntax;

public class FigureSupplier {
    private final int FIGURE_COUNT = 5;
    private final int RANDOM_VALUE = 20;
    private final int MIN_VALUE = 1;

    public Figure getRandomFigure() {
        int randomNumber = (int) (Math.random() * FIGURE_COUNT);
        switch (randomNumber) {
            case 0: return createCircle();
            case 1: return createIsoscelesTrapezoid();
            case 2: return createRectangle();
            case 3: return createRightTriangle();
            default: return createSquare();
        }
    }

    private Figure createCircle() {
        return new Circle((int) (Math.random() * RANDOM_VALUE + MIN_VALUE));
    }

    private Figure createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                (int) (Math.random() * RANDOM_VALUE + MIN_VALUE),
                (int) (Math.random() * RANDOM_VALUE + MIN_VALUE),
                (int) (Math.random() * RANDOM_VALUE + MIN_VALUE));
    }

    private Figure createRectangle() {
        return new Rectangle(
                (int) (Math.random() * RANDOM_VALUE + MIN_VALUE),
                (int) (Math.random() * RANDOM_VALUE + MIN_VALUE));
    }

    private Figure createRightTriangle() {
        return new RightTriangle((int) (Math.random() * RANDOM_VALUE + MIN_VALUE));
    }

    private Figure createSquare() {
        return new Square((int) (Math.random() * RANDOM_VALUE + MIN_VALUE));
    }
}
