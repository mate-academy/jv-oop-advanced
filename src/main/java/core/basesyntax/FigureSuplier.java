package core.basesyntax;

import java.util.Random;

public class FigureSuplier {
    private static final int MAX_NUMBER = 5;
    private Random random = new Random();
    private final ColorSuplier color = new ColorSuplier();

    public Figure getRandomFigure() {
        switch (getRandomNumber()) {
            case 0:
                return new Circle(color.getRandomColor(),
                        getRandomNumber());
            case 1:
                return new Square(getRandomNumber(),
                        color.getRandomColor());
            case 2:
                return new Rectangle(getRandomNumber(),
                        getRandomNumber(),
                        color.getRandomColor());
            case 3:
                return new RightTriangle(color.getRandomColor(),
                        getRandomNumber(),
                        getRandomNumber());
            default:
                return new IsoscelesTrapezoid(color.getRandomColor(),
                        getRandomNumber(),
                        getRandomNumber(),
                        getRandomNumber());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    public int getRandomNumber() {
        return random.nextInt(MAX_NUMBER);
    }
}

