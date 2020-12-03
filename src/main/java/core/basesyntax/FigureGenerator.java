package core.basesyntax;

import java.util.Random;

public class FigureGenerator {
    private static final int NumberOfFigures = 5;

    public static Figure createFigure() {
        switch (new Random().nextInt(NumberOfFigures)) {
            case 1:
                return new Circle(getRandomNumber(), getRandomColor());
            case 2:
                return new RightTriangle(getRandomNumber(), getRandomNumber(),
                        getRandomNumber(), getRandomColor());
            case 3:
                return new Rectangle(getRandomNumber(), getRandomNumber(), getRandomColor());
            case 4:
                return new Square(getRandomNumber(), getRandomColor());
            default:
                return new IsoscelesTrapezoid(getRandomNumber(),
                        getRandomNumber(), getRandomNumber(), getRandomColor());
        }
    }

    private static String getRandomColor() {
        int randomGenerateIndex = new Random().nextInt(Color.values().length);
        return Color.values()[randomGenerateIndex].toString();
    }

    public static int getRandomNumber() {
        return new Random().nextInt(100);
    }
}
