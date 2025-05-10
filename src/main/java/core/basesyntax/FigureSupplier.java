package core.basesyntax;

import java.security.SecureRandom;

public class FigureSupplier {
    private static final int BOUND_OF_RANDOM = 100;
    private final ColorSupplier randomColor = new ColorSupplier();
    private final SecureRandom random = new SecureRandom();

    public int getRandomNumber() {
        return random.nextInt(BOUND_OF_RANDOM);
    }

    public NameOfFigure getRandomNameOfFigure() {
        return NameOfFigure.values()[random.nextInt(NameOfFigure.values().length)];
    }

    public Figure getRandomFigure() {
        int randomSide = getRandomNumber();
        int randomSide1 = getRandomNumber();
        int randomSide2 = getRandomNumber();
        int randomRadius = getRandomNumber();

        switch (getRandomNameOfFigure()) {
            case CIRCLE:
                return new Circle(randomColor.getRandomColor(), randomRadius);
            case SQUARE:
                return new Square(randomColor.getRandomColor(), randomSide);
            case TRIANGLE:
                return new RightTriangle(randomColor.getRandomColor(), randomSide, randomSide2);
            case RECTANGLE:
                return new Rectangle(randomColor.getRandomColor(), randomSide, randomSide1);
            case TRAPEZOID:
                return new IsoscelesTrapezoid(randomColor.getRandomColor(),
                        randomSide, randomSide1, randomSide2);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
