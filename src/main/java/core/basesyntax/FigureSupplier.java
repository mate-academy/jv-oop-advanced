package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_SIZE = 10;
    public static final int MAX_SIDE_SIZE = 100;
    private ColorSupplier randomColor = new ColorSupplier();
    private Random randomNumber = new Random();

    public Figure getRandomFigure() {
        int index = new Random().nextInt(FigureType.values().length);
        switch (FigureType.values()[index]) {
            case CIRCLE:
                return new Circle(randomColor.getRandomColor(),
                        randomNumber.nextInt(MAX_SIDE_SIZE));
            case SQUARE:
                return new Square(randomColor.getRandomColor(),
                        randomNumber.nextInt(MAX_SIDE_SIZE));
            case RECTANGLE:
                return new Rectangle(randomColor.getRandomColor(),
                        randomNumber.nextInt(MAX_SIDE_SIZE),
                        randomNumber.nextInt(MAX_SIDE_SIZE));
            case RIGHT_TRIANGLE:
                return new RightTriangle(randomColor.getRandomColor(),
                        randomNumber.nextInt(MAX_SIDE_SIZE));
            default:
                return new IsoscelesTrapezoid(randomColor.getRandomColor(),
                        randomNumber.nextInt(MAX_SIDE_SIZE),
                        randomNumber.nextInt(MAX_SIDE_SIZE),
                        randomNumber.nextInt(MAX_SIDE_SIZE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_SIZE);
    }
}
