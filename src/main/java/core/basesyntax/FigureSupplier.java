package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.name(), DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int randomFigureNumber = random.nextInt(FIGURE_COUNT);
        String figureColor = colorSupplier.getRandomColor();
        switch (randomFigureNumber) {
            case 0: return new Rectangle(figureColor, random.nextDouble(), random.nextDouble());
            case 1: return new Square(figureColor, random.nextDouble());
            case 2: return new RightTriangle(figureColor, random.nextDouble(), random.nextDouble());
            case 3: return new Circle(figureColor, random.nextDouble());
            case 4: return new IsoscelesTrapezoid(figureColor, random.nextDouble(),
                    random.nextDouble(), random.nextDouble());
            default: return getDefaultFigure();
        }
    }
}
