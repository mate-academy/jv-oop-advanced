package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final String defaultFigureColor = Color.WHITE.name();
    public static final double defaultFigureRadius = 10.0;

    private Square squareObject() {
        return new Square(new ColorSupplier().getRandomColor(),
                new Random().nextInt(10));
    }

    private RightTriangle rightTriangleObject() {
        return new RightTriangle(new ColorSupplier().getRandomColor(),
                new Random().nextInt(10),
                new Random().nextInt(10));
    }

    private Rectangle rectangleObject() {
        return new Rectangle(new ColorSupplier().getRandomColor(),
                new Random().nextInt(10),
                new Random().nextInt(10));
    }

    private IsoscelesTrapezoid isoscelesTrapezoidObject() {
        return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                new Random().nextInt(10),
                new Random().nextInt(10),
                new Random().nextInt(10));
    }

    private Circle circleObject() {
        return new Circle(new ColorSupplier().getRandomColor(),
                new Random().nextInt(10));
    }

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
        return new Circle(defaultFigureColor, defaultFigureRadius);
    }
}

