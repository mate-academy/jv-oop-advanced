package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEF_COLOR = Color.WHITE;
    private static final double DEF_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final FigureShape[] figureArr = FigureShape.values();

    public Figure getRandomFigure() {
        switch (figureArr[random.nextInt(figureArr.length)]) {
            case CIRCLE:
                return new Circle(random.nextDouble(), colorSupplier.getRandomColor());
            case RECTANGLE:
                return new Rectangle(random.nextDouble(),
                        random.nextDouble(), colorSupplier.getRandomColor());
            case SQUARE:
                return new Square(random.nextDouble(), colorSupplier.getRandomColor());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(random.nextDouble(),
                        random.nextDouble(), random.nextDouble(), colorSupplier.getRandomColor());
            case RIGHT_TRIANGLE:
                return new RightTriangle(random.nextDouble(),
                        random.nextDouble(), colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEF_RADIUS, DEF_COLOR.name().toLowerCase());
    }
}
