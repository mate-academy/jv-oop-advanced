package core.basesyntax;

import java.util.Random;

public class FigureProducer {
    private static final int FIGURE_COUNT = 5;

    public static Figure getFigure() {
        int numberOfFigure = new Random().nextInt(FIGURE_COUNT);
        switch (numberOfFigure) {
            case 1: return new Circle(getColor(), getRandomNumber());
            case 2: return new Rectangle(getColor(), getRandomNumber(), getRandomNumber());
            case 3: return new Square(getColor(), getRandomNumber());
            case 4: return new RightTriangle(getColor(), getRandomNumber(), getRandomNumber());
            case 5:
            default:
                return new IsoscelesTrapezoid(getColor(), getRandomNumber(),
                        getRandomNumber(), getRandomNumber());
        }
    }

    public static int getRandomNumber() {
        return new Random().nextInt(10) + 1;
    }

    public static Color getColor() {
        int randomGeneratedIndex = new Random().nextInt(Color.values().length);
        return Color.values()[randomGeneratedIndex];
    }
}
