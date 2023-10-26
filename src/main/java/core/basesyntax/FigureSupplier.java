package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final String DEFAULT_FIGURE_COLOR = Color.WHITE.name();
    public static final double DEFAULT_FIGURE_RADIUS = 10.0;
    public static final String RANDOM_COLOR = new ColorSupplier().getRandomColor();
    public static final double RANDOM_DIMENSION = new Random().nextInt(10);

    public Figure getRandomFigure() {
        int figureNumber = new Random().nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return squareObject();
            case 1:
                return rightTriangleObject();
            case 3:
                return rectangleObject();
            case 4:
                return isoscelesTrapezoidObject();
            default:
                return circleObject();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_COLOR, DEFAULT_FIGURE_RADIUS);
    }

    private Square squareObject() {
        return new Square(RANDOM_COLOR, RANDOM_DIMENSION);
    }

    private RightTriangle rightTriangleObject() {
        return new RightTriangle(RANDOM_COLOR, RANDOM_DIMENSION, RANDOM_DIMENSION);
    }

    private Rectangle rectangleObject() {
        return new Rectangle(RANDOM_COLOR, RANDOM_DIMENSION, RANDOM_DIMENSION);
    }

    private IsoscelesTrapezoid isoscelesTrapezoidObject() {
        return new IsoscelesTrapezoid(RANDOM_COLOR,
                RANDOM_DIMENSION, RANDOM_DIMENSION, RANDOM_DIMENSION);
    }

    private Circle circleObject() {
        return new Circle(RANDOM_COLOR, RANDOM_DIMENSION);
    }

}
