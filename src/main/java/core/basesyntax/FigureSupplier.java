package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final double DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = String.valueOf(Color.WHITE);
    private Random index = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (index.nextInt(NUMBER_OF_FIGURES) + 1) {
            case 1:
                return new Circle(color.getRandomColor(), index.nextDouble());
            case 2:
                return new Square(color.getRandomColor(), index.nextDouble());
            case 3:
                return new Rectangle(color.getRandomColor(), index.nextDouble(),
                        index.nextDouble());
            case 4:
                return new RightTriangle(color.getRandomColor(), index.nextDouble(),
                        index.nextDouble());
            default:
                return new IsoscelesTrapezoid(color.getRandomColor(), index.nextDouble(),
                        index.nextDouble(), index.nextDouble());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}

