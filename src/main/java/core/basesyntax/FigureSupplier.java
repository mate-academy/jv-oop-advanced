package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_LENGHT = 20;
    private static final int CIRCLE_RADIUS = 10;
    private final int numberOfTypes = TypeOfFigure.values().length;
    private final ColorSupplier randomColor = new ColorSupplier();
    private final Random random = new Random();

    public int getRandomNumber() {
        return random.nextInt(RANDOM_LENGHT);
    }

    public TypeOfFigure getRandomTypeOfFigure() {
        return TypeOfFigure.values()[random.nextInt(numberOfTypes)];
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, CIRCLE_RADIUS);
    }

    public Figure getRandomFigure() {
        switch (getRandomTypeOfFigure()) {
            case CIRCLE:
                return new Circle(randomColor.getRandomColor(), getRandomNumber());
            case SQUARE:
                return new Square(randomColor.getRandomColor(), getRandomNumber());
            case TRIANGLE:
                return new RightTriangle(randomColor.getRandomColor(),
                        getRandomNumber(), getRandomNumber());
            case RECTANGLE:
                return new Rectangle(randomColor.getRandomColor(),
                        getRandomNumber(), getRandomNumber());
            case TRAPEZOID:
                return new IsoscelesTrapezoid(randomColor.getRandomColor(),
                        getRandomNumber(), getRandomNumber(), getRandomNumber());
            default:
                return getDefaultFigure();
        }
    }
}
