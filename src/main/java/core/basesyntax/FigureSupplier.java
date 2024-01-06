package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_NUMBER = 20;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_NUMBER));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER), random.nextInt(MAX_NUMBER));
            case 3:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_NUMBER));
            case 4:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER));
            case 5:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER), random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
