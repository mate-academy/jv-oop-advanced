package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private String defaultColor = "WHITE";
    private int defaultRadius = 10;
    private int maxNumber = 100;
    private Random random = new Random();

    public Figure getRandomFigure() {

        ColorSupplier randomColor = new ColorSupplier();
        String color = randomColor.getRandomColor();
        int value1 = random.nextInt(maxNumber);
        int value2 = random.nextInt(maxNumber);
        int value3 = random.nextInt(maxNumber);
        int index = random.nextInt(Type.values().length);

        switch (Type.values()[index]) {
            case CIRCLE:
                return getRandomCircle(color,value1);
            case RECTANGLE:
                return getRandomRectangle(color, value1, value2);
            case TRAPEZOID:
                return getRandomTrapezoid(color, value1, value2, value3);
            case SQUARE:
                return getRandomSquare(color, value1);
            default:
                return getRandomTriangle(color, value1);
        }
    }

    private Figure getRandomSquare(String color, int value1) {
        Figure square = new Square(color,value1);
        return square;
    }

    private Figure getRandomCircle(String color, int value1) {
        Figure circle = new Circle(color,value1);
        return circle;
    }

    private Figure getRandomTriangle(String color, int value1) {
        Figure triangle = new RightTriangle(color,value1);
        return triangle;
    }

    private Figure getRandomRectangle(String color, int value1, int value2) {
        Figure rectangle = new Rectangle(color,value1,value2);
        return rectangle;
    }

    private Figure getRandomTrapezoid(String color, int value1, int value2, int value3) {
        Figure trapezoid = new IsoscelesTrapezoid(color,value1, value2, value3);
        return trapezoid;
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle(defaultColor, defaultRadius);
        return figure;
    }
}
