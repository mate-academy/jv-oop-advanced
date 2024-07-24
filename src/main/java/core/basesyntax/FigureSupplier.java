package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int RANDOM_FIGURE_PARAMETER = 100;
    private static final int DEFAULT_FIGURE_RADIUS = 100;
    private static final String DEFAULT_FIGURE_COLOR = "WHITE";
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigureNum = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (randomFigureNum) {
            case 0:
                return new Square(color,
                        getRandomFigureParameter());
            case 1:
                return new Rectangle(color,
                        getRandomFigureParameter(),
                        getRandomFigureParameter());
            case 2:
                return new RightTriangle(color,
                        getRandomFigureParameter(),
                        getRandomFigureParameter());
            case 3:
                return new Circle(getRandomFigureParameter(),
                        color);
            case 4:
                return new IsoscelesTrapezoid(color,
                        getRandomFigureParameter(),
                        getRandomFigureParameter(),
                        getRandomFigureParameter());
            default:
                throw new IllegalStateException("Unexpected value: " + randomFigureNum);
        }
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle(DEFAULT_FIGURE_RADIUS, DEFAULT_FIGURE_COLOR);
        return figure;
    }

    private int getRandomFigureParameter() {
        return random.nextInt(RANDOM_FIGURE_PARAMETER);
    }
}
