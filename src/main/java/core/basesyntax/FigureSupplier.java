package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static final Color DEFAULT_FIGURE_COLOR = Color.WHITE;
    public static final int DEFAULT_FIGURE_RADIUS = 10;
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURE_COUNT + 1);
        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextDouble());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble(),
                        random.nextDouble(), random.nextDouble());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble(), random.nextDouble());
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble(), random.nextDouble());
            default:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextDouble());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_COLOR, DEFAULT_FIGURE_RADIUS);
    }
}
