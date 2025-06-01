package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_SIZE = 10;
    private static final String DEFAULT_COLOR = "white";

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (index) {
            case 0:
                return new Circle(color, random.nextDouble() * MAX_SIZE);
            case 1:
                return new Square(color, random.nextDouble() * MAX_SIZE);
            case 2:
                return new Rectangle(color, random.nextDouble() * MAX_SIZE,
                        random.nextDouble() * MAX_SIZE);
            case 3:
                return new RightTriangle(color,
                        random.nextDouble() * MAX_SIZE,
                        random.nextDouble() * MAX_SIZE);
            case 4:
                return new IsoscelesTrapezoid(color,
                        random.nextDouble() * MAX_SIZE,
                        random.nextDouble() * MAX_SIZE,
                        random.nextDouble() * MAX_SIZE);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, 10);
    }
}
