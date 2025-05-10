package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final String DEFAULT_FIGURE_COLOR = Color.WHITE.name();
    public static final double DEFAULT_FIGURE_RADIUS = 10.0;

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
        double randomDimension = new Random().nextInt(10);
        String randomColor = new ColorSupplier().getRandomColor();
        return new Square(randomColor, randomDimension);
    }

    private RightTriangle rightTriangleObject() {
        double randomDimension = new Random().nextInt(10);
        String randomColor = new ColorSupplier().getRandomColor();
        return new RightTriangle(randomColor, randomDimension, randomDimension);
    }

    private Rectangle rectangleObject() {
        double randomDimension = new Random().nextInt(10);
        String randomColor = new ColorSupplier().getRandomColor();
        return new Rectangle(randomColor, randomDimension, randomDimension);
    }

    private IsoscelesTrapezoid isoscelesTrapezoidObject() {
        double randomDimension = new Random().nextInt(10);
        String randomColor = new ColorSupplier().getRandomColor();
        return new IsoscelesTrapezoid(randomColor, randomDimension,
                randomDimension, randomDimension);
    }

    private Circle circleObject() {
        double randomDimension = new Random().nextInt(10);
        String randomColor = new ColorSupplier().getRandomColor();
        return new Circle(randomColor, randomDimension);
    }
}
