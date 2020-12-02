package core.basesyntax;

import java.util.Random;

public class FabricFigure {
    private static Random random = new Random();
    private static final double MINVALUE = 2;
    private static final double MAXVALUE = 25;
    private static final int COUNT_FIGURES = 5;

    public static Figure createRandomFigure() {
        switch (new Random().nextInt(COUNT_FIGURES)) {
            case 0:
                return createRectangle();
            case 1:
                return createSquare();
            case 2:
                return createRightTriangle();
            case 3:
                return createCircle();
            case 4:
                return createIsoscelesTrapezoid();
            default:
                return null;
        }
    }

    private static Rectangle createRectangle() {
        return new Rectangle(
                getRandom(MINVALUE, MAXVALUE),
                getRandom(MINVALUE, MAXVALUE),
                getRandomColour());
    }

    private static Square createSquare() {
        return new Square(getRandom(MINVALUE, MAXVALUE), getRandomColour());
    }

    private static RightTriangle createRightTriangle() {
        return new RightTriangle(
                getRandom(MINVALUE, MAXVALUE),
                getRandom(MINVALUE, MAXVALUE),
                getRandomColour());
    }

    private static Circle createCircle() {
        return new Circle(getRandom(MINVALUE, MAXVALUE), getRandomColour());
    }

    private static IsoscelesTrapezoid createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                getRandom(MINVALUE, MAXVALUE),
                getRandom(MINVALUE, MAXVALUE),
                getRandom(MINVALUE, MAXVALUE),
                getRandomColour());
    }

    private static double getRandom(double min, double max) {
        return random.nextDouble() * (max - min) + min;
    }

    private static Colour getRandomColour() {
        return Colour.values()[random.nextInt(Colour.values().length)];
    }
}
