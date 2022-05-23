package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int numberTen = 10;
    public static final int maxSideSize = 100;
    private ColorSupplier randomColor = new ColorSupplier();
    private Random randomNumber = new Random();

    public Figure getRandomFigure() {
        int index = new Random().nextInt(FigureType.values().length);
        switch (FigureType.values()[index]) {
            case CIRCLE:
                return new Circle(randomColor.getRandomColor(), randomNumber.nextInt(maxSideSize));
            case SQUARE:
                return new Square(randomColor.getRandomColor(), randomNumber.nextInt(maxSideSize));
            case RECTANGLE:
                return new Rectangle(randomColor.getRandomColor(),
                        randomNumber.nextInt(maxSideSize),
                        randomNumber.nextInt(maxSideSize));
            case RIGHT_TRIANGLE:
                return new RightTriangle(randomColor.getRandomColor(),
                        randomNumber.nextInt(maxSideSize));
            default:
                return new IsoscelesTrapezoid(randomColor.getRandomColor(),
                        randomNumber.nextInt(maxSideSize),
                        randomNumber.nextInt(maxSideSize),
                        randomNumber.nextInt(maxSideSize));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), numberTen);
    }
}
