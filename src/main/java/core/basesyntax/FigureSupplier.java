package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double MAX_SIZE = 10.0;
    private static final String DEFAULT_COLOR = "білий";
    private static final double DEFAULT_RADIUS = 10.0;

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return new Circle(color, random.nextDouble() * MAX_SIZE);
            case 1:
                return new Square(color, random.nextDouble() * MAX_SIZE);
            case 2:
                return new Rectangle(color, random.nextDouble() * MAX_SIZE, random.nextDouble() * MAX_SIZE);
            case 3:
                return new RightTriangle(color, random.nextDouble() * MAX_SIZE, random.nextDouble() * MAX_SIZE);
            case 4:
                return new IsoscelesTrapezoid(color, random.nextDouble() * MAX_SIZE,
                        random.nextDouble() * MAX_SIZE, random.nextDouble() * MAX_SIZE);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
