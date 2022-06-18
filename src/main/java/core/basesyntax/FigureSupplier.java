package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final double DEFAULT_RADIUS = 10;
    private final FigureType[] figureType = FigureType.values();
    private final Random random = new Random();

    public Figures getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (figureType[random.nextInt(figureType.length)]) {
            case CIRCLE:
                return new Circle(random.nextDouble(),
                        colorSupplier.getRandomColor());
            case ISOSCALESTRAPECOID:
                return new IsoscelesTrapezoid(random.nextDouble(),
                        random.nextDouble(), random.nextDouble(),
                        colorSupplier.getRandomColor());
            case RECTANGLE:
                return new Rectangle(random.nextDouble(), random.nextDouble(),
                        colorSupplier.getRandomColor());
            case RIGHTTRIANGLE:
                return new RightTriangle(random.nextDouble(), random.nextDouble(),
                        colorSupplier.getRandomColor());
            default:
                return new Square(random.nextDouble(),
                        colorSupplier.getRandomColor());
        }
    }

    public Figures getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR.toString());
    }
}
