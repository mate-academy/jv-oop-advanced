package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        FigureType randomFigure = FigureType.values()[random.nextInt(FigureType.values().length)];
        switch (randomFigure) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER));
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER));
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER));
            case RIGHT_RECTANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER));
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE,10);
    }

}
