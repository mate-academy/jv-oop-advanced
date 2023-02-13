package core.basesyntax.figures;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 30;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureName figureName = FigureName.values()[random.nextInt(FigureName.values().length)];
        switch (figureName) {
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_NUMBER));
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER));
            case RIGHT_TRIANGLE: return new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_NUMBER), random.nextInt(MAX_NUMBER));
            case CIRCLE: return new Circle(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_NUMBER));
            default: return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_NUMBER), random.nextInt(MAX_NUMBER),
                    random.nextInt(MAX_NUMBER));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
