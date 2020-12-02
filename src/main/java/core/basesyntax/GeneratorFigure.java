package core.basesyntax;

import java.util.Random;

public class GeneratorFigure {
    private static final int COUNT_OF_FIGURE = 5;

    public Figure getFigure() {
        int randomGeneratedIndex = new Random().nextInt(COUNT_OF_FIGURE);
        switch (randomGeneratedIndex) {
            case 0:
                return new Square(getColor(),new Random().nextInt());
            case 1:
                return new Rectangle(getColor(), new Random().nextInt(), new Random().nextInt());
            case 2:
                return new Circle(getColor(), new Random().nextInt());
            case 3:
                return new IsoscelesTrapezoid(getColor(), new Random().nextInt(),
                        new Random().nextInt(), new Random().nextInt());
            case 4:
            default:
                return new RightTriangle(getColor(), new Random().nextInt(),
                        new Random().nextInt());
        }
    }

    private Color getColor() {
        int randomGeneratedIndex = new Random().nextInt(Color.values().length);
        return Color.values()[randomGeneratedIndex];
    }
}
