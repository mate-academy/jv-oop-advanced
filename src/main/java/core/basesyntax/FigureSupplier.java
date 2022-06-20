package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEF_COLOR = "WHITE";
    private static final int DEF_RADIUS = 10;
    private static final int MAX_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = randomColor.getRandomColor();
        int value1 = random.nextInt(MAX_NUMBER);
        int value2 = random.nextInt(MAX_NUMBER);
        int value3 = random.nextInt(MAX_NUMBER);
        int index = random.nextInt(Type.values().length);

        switch (Type.values()[index]) {
            case CIRCLE:
                return getRandomCircle(color);
            case RECTANGLE:
                return getRandomRectangle(color);
            case TRAPEZOID:
                return getRandomTrapezoid(color);
            case SQUARE:
                return getRandomSquare(color);
            default:
                return getRandomTriangle(color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEF_COLOR, DEF_RADIUS);
    }

    private Figure getRandomSquare(String color) {
        int side = random.nextInt(MAX_NUMBER);
        return new Square(color, side);
    }

    private Figure getRandomCircle(String color) {
        int radius = random.nextInt(MAX_NUMBER);
        return new Circle(color,radius);
    }

    private Figure getRandomTriangle(String color) {
        int side = random.nextInt(MAX_NUMBER);
        return new RightTriangle(color, side);
    }

    private Figure getRandomRectangle(String color) {
        int sideA = random.nextInt(MAX_NUMBER);
        int sideB = random.nextInt(MAX_NUMBER);
        return new Rectangle(color,sideA,sideB);
    }

    private Figure getRandomTrapezoid(String color) {
        int top = random.nextInt(MAX_NUMBER);
        int bottom = random.nextInt(MAX_NUMBER);
        int height = random.nextInt(MAX_NUMBER);
        return new IsoscelesTrapezoid(color,top, bottom, height);
    }
}
