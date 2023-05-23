package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int DEFAULT_CIRCLE_RADIUS = 10;
    static final int SIDE_LENGTH = 100;
    static final String DEFAULT_CIRCLE_COLOR = "white";
    static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    private ColorSupplier colorSupplier = new ColorSupplier();

    private Figure prepareSquare() {
        return new Square(random.nextInt(SIDE_LENGTH),
                          colorSupplier.getRandomColor());
    }

    private Figure prepareCircle() {
        return new Circle(random.nextInt(SIDE_LENGTH),
                colorSupplier.getRandomColor());
    }

    private Figure prepareRectangle() {
        return new Rectangle(random.nextInt(SIDE_LENGTH),
                random.nextInt(SIDE_LENGTH),
                colorSupplier.getRandomColor());
    }

    private Figure prepareRightTriangle() {
        return new RightTriangle(random.nextInt(SIDE_LENGTH),
                                 random.nextInt(SIDE_LENGTH),
                                 colorSupplier.getRandomColor());
    }

    private Figure prepareIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(SIDE_LENGTH),
                random.nextInt(SIDE_LENGTH),
                random.nextInt(SIDE_LENGTH),
                colorSupplier.getRandomColor());
    }

    public Figure getRandomFigure() {
        int numberFigure = random.nextInt(FIGURE_COUNT);

        switch (numberFigure) {
            case 0:
                return prepareSquare();
            case 1:
                return prepareCircle();
            case 2:
                return prepareRectangle();
            case 3:
                return prepareRightTriangle();
            case 4:
                return prepareIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, DEFAULT_CIRCLE_COLOR);
    }
}
