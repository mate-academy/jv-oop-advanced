package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double MAX_SIDE = 10;
    private static final int RADIUS = 10;
    private final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();
    private final double firstSide = random.nextDouble() * MAX_SIDE;
    private final double secondSide = random.nextDouble() * MAX_SIDE;
    private final double thirdSide = random.nextDouble() * MAX_SIDE;

    private Square prepareSquare() {
        return new Square(color.getRandomColor(), firstSide);
    }

    private Circle prepareCircle() {
        return new Circle(color.getRandomColor(), firstSide);
    }

    private RightTriangle prepareRightTriangle() {
        return new RightTriangle(color.getRandomColor(), firstSide, secondSide);
    }

    private IsoscelesTrapezoid prepareIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(color.getRandomColor(), firstSide, secondSide, thirdSide);
    }

    private Rectangle prepareRectangle() {
        return new Rectangle(color.getRandomColor(), firstSide, secondSide);
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
        return new Circle(DEFAULT_COLOR, RADIUS);
    }
}
