package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static final int FIGURE_RANDOM_COUNT = 20;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        int figureGenerate = random.nextInt(FIGURE_RANDOM_COUNT);
        switch (figureGenerate) {
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

    private Square getRandomSquare() {
        return new Square(random.nextInt(FIGURE_RANDOM_COUNT),
                colorSupplier.getRandomColor());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(random.nextInt(FIGURE_RANDOM_COUNT),
                random.nextInt(FIGURE_RANDOM_COUNT),
                colorSupplier.getRandomColor());
    }

    private Circle getRandomCircle() {
        return new Circle(random.nextInt(FIGURE_RANDOM_COUNT),
                colorSupplier.getRandomColor());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(FIGURE_RANDOM_COUNT),
                random.nextInt(FIGURE_RANDOM_COUNT),
                colorSupplier.getRandomColor());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(FIGURE_RANDOM_COUNT),
                random.nextInt(FIGURE_RANDOM_COUNT),
                random.nextInt(FIGURE_RANDOM_COUNT),
                colorSupplier.getRandomColor());
    }
}
