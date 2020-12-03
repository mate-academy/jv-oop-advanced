package core.basesyntax;

import java.util.Random;

public class FigureGenerator {
    private static final int COUNTER_OF_FIGURE_IMPLEMENTATION = 5;

    public Figure get() {
        int randomGeneratedIndex = new Random().nextInt(COUNTER_OF_FIGURE_IMPLEMENTATION);
        switch (randomGeneratedIndex) {
            case 0: return getCircle();
            case 1: return getIsoscelesTrapezoid();
            case 2: return getRectangle();
            case 3: return getRightTriangle();
            default: return getSquare();
        }
    }

    private Circle getCircle() {
        double randomRadius = (new Random().nextInt(10));
        int numberOfColor = new Random().nextInt(Color.values().length);
        Color colorOfCircle = Color.values()[numberOfColor];
        Circle circle = new Circle("Circle",
                colorOfCircle, randomRadius);

        return circle;
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        double randomFirstLine = (new Random().nextInt(10));
        double randomSecondLine = (new Random().nextInt(10));
        double randomHeight = (new Random().nextInt(10));
        int numberOfColor = new Random().nextInt(Color.values().length);
        Color colorOfIsoscelesTrapezoid = Color.values()[numberOfColor];
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid("Isosceles Trapezoid",
                colorOfIsoscelesTrapezoid, randomFirstLine, randomSecondLine, randomHeight);

        return isoscelesTrapezoid;
    }

    private Rectangle getRectangle() {
        double randomFirstLine = (new Random().nextInt(10));
        double randomSecondLine = (new Random().nextInt(10));
        int numberOfColor = new Random().nextInt(Color.values().length);
        Color colorOfRectangle = Color.values()[numberOfColor];
        Rectangle rectangle = new Rectangle("Rectangle",
                colorOfRectangle, randomFirstLine, randomSecondLine);

        return rectangle;
    }

    private RightTriangle getRightTriangle() {
        double randomFirstLine = (new Random().nextInt(10));
        double randomSecondLine = (new Random().nextInt(10));
        int numberOfColor = new Random().nextInt(Color.values().length);
        Color colorOfRightTriangle = Color.values()[numberOfColor];
        RightTriangle rightTriangle = new RightTriangle("Right Triangle",
                colorOfRightTriangle, randomFirstLine, randomSecondLine);

        return rightTriangle;
    }

    private Square getSquare() {
        double randomFirstLine = (new Random().nextInt(10));
        int numberOfColor = new Random().nextInt(Color.values().length);
        Color colorOfSquare = Color.values()[numberOfColor];
        Square square = new Square("Square", colorOfSquare, randomFirstLine);

        return square;
    }
}
