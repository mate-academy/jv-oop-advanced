package core.basesyntax;

import java.util.Random;

public class FigureGenerator {
    static final int FIGURES_QUANTITY = 5;

    public static Figures getRandomFigure() {
        switch (new Random().nextInt(FIGURES_QUANTITY)) {
            case 1:
                return new Square(getRandomColor(), getRandomNumber());
            case 2:
                return new IsoscelesTrapezoid(getRandomColor(), getRandomNumber(),
                        getRandomNumber(), getRandomNumber());
            case 3:
                return new RightTriangle(getRandomColor(), getRandomNumber(), getRandomNumber());
            case 4:
                return new Rectangle(getRandomColor(), getRandomNumber(), getRandomNumber());
            default:
                return new Circle(getRandomColor(), getRandomNumber());
        }
    }

    private static int getRandomNumber() {
        return new Random().nextInt(150);
    }

    private static Colors getRandomColor() {
        Colors[] color = Colors.values();
        Random random = new Random();
        return color[random.nextInt(color.length)];
    }
}
