package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_NUMBER);

        switch (figureType) {
            case 0:
                return new Circle(color.getRandomColor(),
                        random.nextInt(MAX_NUMBER));
            case 1:
                return new Square(color.getRandomColor(),
                        random.nextInt(MAX_NUMBER));
            case 2:
                return new Rectangle(color.getRandomColor(),
                        random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER));
            case 3:
                return new RightTriangle(color.getRandomColor(),
                        random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER));
            case 4:
                return new IsoscelesTrapezoid(color.getRandomColor(),
                        random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
