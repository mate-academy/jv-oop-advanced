package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private Random random;
    private ColorSupplier colorSupplier;

    public FigureSupplier() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        FigureType type = FigureType.values()[random.nextInt(FigureType.values().length)];
        Color color = colorSupplier.getRandomColor();
        int randomInt = random.nextInt(MAX_VALUE);
        if (type == FigureType.SQUARE) {
            return new Square(color,randomInt);
        }
        if (type == FigureType.CIRCLE) {
            return new Circle(color,randomInt);
        }
        if (type == FigureType.ISOSCELES_TRAPEZOID) {
            return new IsoscelesTrapezoid(color, randomInt, randomInt, randomInt);
        }
        if (type == FigureType.RECTANGLE) {
            return new Rectangle(color, randomInt, randomInt);
        }
        if (type == FigureType.RIGHT_TRIANGLE) {
            return new RightTriangle(color, randomInt, randomInt);
        }
        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE,10);
    }
}
