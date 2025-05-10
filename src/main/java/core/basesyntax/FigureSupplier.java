package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURE);
        switch (index) {
            case 0: return new Circle(color.getRandomColor(), random.nextDouble());
            case 1: return new IsoscelesTrapezoid(color.getRandomColor(), random.nextDouble(),
                    random.nextDouble(), random.nextDouble());
            case 2: return new Square(color.getRandomColor(), random.nextDouble());
            case 3: return new Rectangle(color.getRandomColor(), random.nextDouble(),
                random.nextDouble());
            case 4: return new RightTriangle(color.getRandomColor(), random.nextDouble(),
                random.nextDouble());
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR,DEFAULT_RADIUS);
    }
}
