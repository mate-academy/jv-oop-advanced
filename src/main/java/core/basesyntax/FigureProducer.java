package core.basesyntax;

import java.util.Random;

public class FigureProducer {
    public static final int figure = 5;

    public static Figure getFigure() {
        int numberOfFigure = new Random().nextInt(figure);
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

    public static Colors getColor() {
        int randomGeneratedIndex = new Random().nextInt(Colors.values().length);
        return Colors.values()[randomGeneratedIndex];
    }
}
