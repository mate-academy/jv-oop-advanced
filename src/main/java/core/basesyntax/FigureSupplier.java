package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
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
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble() * IsoscelesTrapezoid.MAX_BASE,
                        random.nextDouble() * IsoscelesTrapezoid.MAX_BASE,
                        random.nextDouble() * IsoscelesTrapezoid.MAX_HEIGHT);
            default:
                throw new RuntimeException("Figure type mismatch!");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Figure.DEFAULT_COLOR, Figure.DEFAULT_FIELD_VALUE);
    }
}
