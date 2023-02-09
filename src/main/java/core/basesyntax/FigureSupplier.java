package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_LENGHT = 20;
    private ColorSupplier randomColor = new ColorSupplier();
    private Random random = new Random();

    public int getRandomNumber() {
        return random.nextInt(RANDOM_LENGHT);
    }
    public TypeOfFigure getRandomTypeOfFigure() {
        return TypeOfFigure.values()[random.nextInt(TypeOfFigure.values().length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    public Figure getRandomFigure() {
        int randomHeight = getRandomNumber();
        int randomSide1 = getRandomNumber();
        int randomSide2 = getRandomNumber();
        int randomRadius = getRandomNumber();

        switch (getRandomTypeOfFigure()) {
            case CIRCLE:
                return new Circle(randomColor.getRandomColor(), randomRadius);
            case SQUARE:
                return new Square(randomColor.getRandomColor(),randomSide1);
            case TRIANGLE:
                return new RightTriangle(randomColor.getRandomColor(), randomSide1, randomSide2);
            case RECTANGLE:
                return new Rectangle(randomColor.getRandomColor(), randomSide1, randomSide2);
            case TRAPEZOID:
                return new IsoscelesTrapezoid(randomColor.getRandomColor(), randomSide1, randomSide2, randomHeight);
            default:
                return getDefaultFigure();
        }
    }
}
