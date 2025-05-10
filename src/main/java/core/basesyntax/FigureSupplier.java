package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_TYPES_COUNT);
        switch (figureType) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextDouble() * Circle.MAX_RADIUS);
            case 1:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextDouble() * Square.MAX_SIDE);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * Rectangle.MAX_WIDTH,
                        random.nextDouble() * Rectangle.MAX_WIDTH);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * RightTriangle.MAX_LEG,
                        random.nextDouble() * RightTriangle.MAX_LEG,
                        random.nextDouble() * RightTriangle.MAX_BASE);
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble() * IsoscelesTrapezoid.MAX_BASE,
                        random.nextDouble() * IsoscelesTrapezoid.MAX_BASE,
                        random.nextDouble() * IsoscelesTrapezoid.MAX_HEIGHT);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Figure.DEFAULT_COLOR, Figure.DEFAULT_FIELD_VALUE);
    }
}
