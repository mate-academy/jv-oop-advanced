package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final int MAX_RANDOM_VALUE = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Figure defaultFigure = new Circle(Color.WHITE.name().toLowerCase(), 10);
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        FigureList className = FigureList.values()[figureNumber];
        Figure figure;
        switch (className) {
            case Circle -> figure = new Circle(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_RANDOM_VALUE));
            case Rectangle -> figure = new Rectangle(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_RANDOM_VALUE),
                    random.nextInt(MAX_RANDOM_VALUE));
            case IsoscelesTrapezoid ->
                    figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_RANDOM_VALUE),
                    random.nextInt(MAX_RANDOM_VALUE),
                    random.nextInt(MAX_RANDOM_VALUE));
            case Square -> figure = new Square(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_RANDOM_VALUE));
            case RightTriangle -> figure = new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_RANDOM_VALUE),
                    random.nextInt(MAX_RANDOM_VALUE));
            default -> figure = null;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return defaultFigure;
    }
}
