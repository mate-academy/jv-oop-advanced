package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);

        switch (figureType) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextDouble());
            case 1:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble(),
                        random.nextDouble());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextDouble(),
                        random.nextDouble());
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble(),
                        random.nextDouble(), random.nextDouble());
            default:
                return new Square(colorSupplier.getRandomColor(), random.nextDouble());

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
