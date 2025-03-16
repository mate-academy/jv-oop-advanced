package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final static int DEFAULT_COUNT_FIGURES = 5;
    private final static int DEFAULT_RADIUS = 10;
    private final static int CIRCLE_NUMBER = 0;
    private final static int ISOSCELES_TRAPEZOID_NUMBER = 1;
    private final static int RECTANGLE_NUMBER = 2;
    private final static int RIGHT_TRIANGLE_NUMBER = 3;
    private final static int SQUARE_NUMBER = 4;
    int getDefaultRandomNumber = new Random().nextInt(100);


    public Figure getRandomFigure() {
        int figure = new Random().nextInt(DEFAULT_COUNT_FIGURES);
        String randomColor = new ColorSupplier().getRandomColor();

        switch (figure) {
            case CIRCLE_NUMBER -> {
                return new Circle(getDefaultRandomNumber, randomColor);
            }
            case ISOSCELES_TRAPEZOID_NUMBER -> {
                int topBase = getDefaultRandomNumber;
                int bottomBase = getDefaultRandomNumber;
                int height = getDefaultRandomNumber;
                return new IsoscelesTrapezoid(topBase, bottomBase, height, randomColor);
            }
            case RECTANGLE_NUMBER-> {
                int length = getDefaultRandomNumber;
                int width = getDefaultRandomNumber;
                return new Rectangle(length, width, randomColor);
            }
            case RIGHT_TRIANGLE_NUMBER -> {
                int firstLeg = getDefaultRandomNumber;
                int secondLeg = getDefaultRandomNumber;
                return new RightTriangle(firstLeg, secondLeg, randomColor);
            }
            case SQUARE_NUMBER -> {
                int sideLength = getDefaultRandomNumber;
                return new Square(sideLength, randomColor);
            }
        }
        return getDefaultFigure();
    }
    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Colors.WHITE.name());
    }
}
