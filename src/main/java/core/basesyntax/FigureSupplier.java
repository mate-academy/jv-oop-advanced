package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MIN_LEG_LENGTH = 1;
    private static final int MAX_LEG_LENGTH = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureTypes type = FigureTypes.values()[random.nextInt(FigureTypes.values().length)];
        switch (type) {
            case SQUARE:
                return new Square(random.nextInt(MIN_LEG_LENGTH,MAX_LEG_LENGTH),
                        colorSupplier.getRandomColor());
            case RECTANGLE:
                return new Rectangle(random.nextInt(MIN_LEG_LENGTH,MAX_LEG_LENGTH),
                        random.nextInt(MIN_LEG_LENGTH,MAX_LEG_LENGTH),
                        colorSupplier.getRandomColor());
            case RIGHT_TRIANGLE:
                return new RightTriangle(random.nextInt(MIN_LEG_LENGTH,MAX_LEG_LENGTH),
                        random.nextInt(MIN_LEG_LENGTH,MAX_LEG_LENGTH),
                        colorSupplier.getRandomColor());
            case CIRCLE:
                return new Circle(random.nextInt(MIN_LEG_LENGTH,MAX_LEG_LENGTH),
                        colorSupplier.getRandomColor());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(random.nextInt(MIN_LEG_LENGTH,MAX_LEG_LENGTH),
                        random.nextInt(MIN_LEG_LENGTH,MAX_LEG_LENGTH),
                        random.nextInt(MIN_LEG_LENGTH,MAX_LEG_LENGTH),
                        colorSupplier.getRandomColor());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.toString());
    }
}
