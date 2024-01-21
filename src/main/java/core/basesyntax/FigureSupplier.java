package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final double MAX_VALUE_PROPERTIES = 50;
    public static final String DEFAULT_COLOR = "white";
    public static final double DEFAULT_RADIUS = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private Figure[] figures = new Figure [] {
            new Circle(colorSupplier.getRandomColor(), random.nextDouble(MAX_VALUE_PROPERTIES)),
            new Square(random.nextDouble(MAX_VALUE_PROPERTIES), colorSupplier.getRandomColor()),
            new RightTriangle(random.nextDouble(MAX_VALUE_PROPERTIES),
                    random.nextDouble(MAX_VALUE_PROPERTIES),
                    colorSupplier.getRandomColor()),
            new Rectangle(random.nextDouble(MAX_VALUE_PROPERTIES),
                    random.nextDouble(MAX_VALUE_PROPERTIES),
                    colorSupplier.getRandomColor()),
            new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextDouble(MAX_VALUE_PROPERTIES),
                    random.nextDouble(MAX_VALUE_PROPERTIES),
                    random.nextDouble(MAX_VALUE_PROPERTIES))
    };

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        int index = random.nextInt(figures.length);
        return figures[index];
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
