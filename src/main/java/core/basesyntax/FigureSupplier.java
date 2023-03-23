package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private final double MAX_SIDE = 10;
    private final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final double firstSide = random.nextDouble() * MAX_SIDE;
    private final double secondSide = random.nextDouble() * MAX_SIDE;
    private final double thirdSide = random.nextDouble() * MAX_SIDE;

    private Square prepareSquare() {
        return new Square(firstSide, ColorSupplier.getRandomColor());
    }

    private Circle prepareCircle() {
        return new Circle(firstSide, ColorSupplier.getRandomColor());
    }

    private RightTriangle prepareRightTriangle() {
        return new RightTriangle(firstSide, secondSide, ColorSupplier.getRandomColor());
    }

    private IsoscelesTrapezoid prepareIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(firstSide, secondSide, thirdSide, ColorSupplier.getRandomColor());
    }

    private Rectangle prepareRectangle() {
        return new Rectangle(firstSide, secondSide, ColorSupplier.getRandomColor());
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0 :
                return prepareSquare();
            case 1 :
                return prepareCircle();
            case 2 :
                return prepareRightTriangle();
            case 3 :
                return prepareIsoscelesTrapezoid();
            default :
                return prepareRectangle();
        }
    }

    public Figure getDefaultFigure() {
        int DEFAULT_RADIUS = 10;
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
