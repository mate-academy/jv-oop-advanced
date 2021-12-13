package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 10;
    private static final int DEFAULT_RADIUS = 10;
    private int randomSide = new Random().nextInt(10);
    private ColorSupplier colors = new ColorSupplier();

    public Figure getRandomFigure() {
        int random = new Random().nextInt(MAX_RANDOM_NUMBER);
        switch (random) {
            case 1:
                IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(
                        randomSide,
                        randomSide,
                        colors.getRandomColor(),
                        randomSide);
                return trapezoid;
            case 2:
                Circle circle = new Circle(randomSide, colors.getRandomColor());
                return circle;
            case 3:
                Square square = new Square(randomSide, colors.getRandomColor());
                return square;
            case 4:
                Rectangle rectangle = new Rectangle(randomSide,
                        randomSide,
                        colors.getRandomColor());
                return rectangle;
            default:
                RightTriangle rightTriangle = new RightTriangle(randomSide,
                        randomSide,
                        colors.getRandomColor());
                return rightTriangle;
        }
    }

    public Figure getDefaultFigure() {
        Circle circleDefault = new Circle(DEFAULT_RADIUS, Colors.WHITE.name());
        return circleDefault;
    }
}

