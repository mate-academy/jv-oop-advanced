package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int SHAPE_COUNT = FigureName.values().length;
    private static final int MAX_LENGTH = 20;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int firstValue = random.nextInt(MAX_LENGTH);
        int secondValue = random.nextInt(MAX_LENGTH);
        String color = colorSupplier.getRandomColor();
        switch (FigureName.values()[random.nextInt(SHAPE_COUNT)]) {
            case SQUARE:
                return new Square(firstValue, color);
            case RECTANGLE:
                return new Rectangle(firstValue, secondValue, color);
            case RIGHT_TRIANGLE:
                return new RightTriangle(firstValue, secondValue, color);
            case CIRCLE:
                return new Circle(firstValue, color);
            default:
                int thirdValue = random.nextInt(MAX_LENGTH);
                return new IsoscelesTrapezoid(firstValue, secondValue, thirdValue, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.BLACK.name());
    }
}
