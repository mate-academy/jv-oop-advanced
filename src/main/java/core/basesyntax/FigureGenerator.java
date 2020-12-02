package core.basesyntax;

import java.util.Random;

public class FigureGenerator {
    private static final String[] arrayOfFigures = new String[]{
            "square", "rectangle", "right triangle", "circle", "isosceles trapezoid"};

    public static Figure createFigure() {
        switch (new Random().nextInt(5)) {
            case 1:
                return new Circle(getRandomNumber(), getRandomColor());
            case 2:
                return new RightTriangle(getRandomNumber(), getRandomNumber(),
                        getRandomNumber(), getRandomColor());
            case 3:
                return new Rectangle(getRandomNumber(), getRandomNumber(), getRandomColor());
            case 4:
                return new Square(getRandomNumber(), getRandomColor());
            case 5:
                return new IsoscelesTrapezoid(getRandomNumber(),
                        getRandomNumber(), getRandomNumber(), getRandomColor());
            default:
                return null;
        }
    }

    private static String getRandomColor() {
        int randomGenerateIndex = new Random().nextInt(6);
        return Color.values()[randomGenerateIndex].toString();
    }

    public static int getRandomNumber() {
        return new Random().nextInt(100);
    }
}
