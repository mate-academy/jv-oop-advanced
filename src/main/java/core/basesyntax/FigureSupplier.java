package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int RANDOM_FIGURE_PARAMETER = 100;
    private static final int DEFAULT_FIGURE_RADIUS = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigureNum = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        int firstRandomParameter = random.nextInt(RANDOM_FIGURE_PARAMETER);
        int secondRandomParameter = random.nextInt(RANDOM_FIGURE_PARAMETER);
        int thirdRandomParameter = random.nextInt(RANDOM_FIGURE_PARAMETER);
        switch (randomFigureNum) {
            case 0:
                return new Square(color,
                        firstRandomParameter);
            case 1:
                return new Rectangle(color,
                        firstRandomParameter,
                        secondRandomParameter);
            case 2:
                return new RightTriangle(color,
                        firstRandomParameter,
                        secondRandomParameter);
            case 3:
                return new Circle(firstRandomParameter,
                        color);
            case 4:
                return new IsoscelesTrapezoid(color,
                        firstRandomParameter,
                        secondRandomParameter,
                        thirdRandomParameter);
            default:
                throw new IllegalStateException("Unexpected value: " + randomFigureNum);
        }
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle(DEFAULT_FIGURE_RADIUS,"WHITE");
        return figure;
    }
}
