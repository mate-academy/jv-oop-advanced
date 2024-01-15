package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private static int getRandomInt = new Random().nextInt(100);
    private static double getRandomDouble = new Random().nextDouble();

    public Figure getRandomFigure() {
        int index = new Random().nextInt(FIGURE_COUNT);
        switch (index) {
            case 0:
                return new Circle(getGetRandomColor(), getRandomInt);

            case 1:
                return new IsoscelesTrapezoid(getGetRandomColor(), getRandomDouble,
                        getRandomDouble, getRandomDouble);

            case 2:
                return new Square(getGetRandomColor(), getRandomInt);

            case 3:
                return new RightTriangle(getGetRandomColor(), getRandomDouble, getRandomDouble);

            case 4:
            default:
                return new Rectangle(getGetRandomColor(), getRandomDouble, getRandomDouble);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public static int getGetRandomInt() {
        return getRandomInt;
    }

    public static void setGetRandomInt(int getRandomInt) {
        FigureSupplier.getRandomInt = getRandomInt;
    }

    public static double getGetRandomDouble() {
        return getRandomDouble;
    }

    public static void setGetRandomDouble(double getRandomDouble) {
        FigureSupplier.getRandomDouble = getRandomDouble;
    }
}
