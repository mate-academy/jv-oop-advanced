package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color
            .valueOf("WHITE");
    private static final int DEFATUL_LENGTH = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureEnum figure = FigureEnum.values()[random.nextInt(FigureEnum.values().length)];
        switch (figure) {
            case SQUARE: return new Square(random.nextDouble(), colorSupplier.getRandomColor());
            case RIGHT_TRIANGLE:
                return new RightTriangle(random.nextDouble(), random.nextDouble(),
                                         colorSupplier.getRandomColor());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(random.nextDouble(), random.nextDouble(),
                                              random.nextDouble(), colorSupplier.getRandomColor());
            case RECTANGLE: return new Rectangle(random.nextDouble(), random.nextDouble(),
                                                   colorSupplier.getRandomColor());
            case CIRCLE: return new Circle(random.nextDouble(), colorSupplier.getRandomColor());
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFATUL_LENGTH, DEFAULT_COLOR);
    }

}
