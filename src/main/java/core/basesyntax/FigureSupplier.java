package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int INT_VALUE = 6;

    public Figure getRandomFigure() {
        Random random = new Random();
        String randomColor = new ColorSupplier().getRandomColor();
        int firstValue = random.nextInt(INT_VALUE) + 1;
        int secondValue = random.nextInt(INT_VALUE) + 1;
        int thirdValue = random.nextInt(INT_VALUE) + 1;

        switch (Figures.values()[random.nextInt(Figures.values().length)]) {
            case RECTANGLE:
                return new Rectangle(randomColor, firstValue, secondValue);
            case ISOSCELESTRAPEZOID:
                return new IsoscelesTrapezoid(randomColor, firstValue, secondValue, thirdValue);
            case CIRCLE:
                return new Circle(randomColor, firstValue);
            case SQUARE:
                return new Square(randomColor, firstValue);
            default:
                return new RightTriangle(randomColor, firstValue, secondValue);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", DEFAULT_RADIUS);
    }
}
