package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_CIRCLE_RADIUS = 10;
    public static final int MAX_INT_FOR_FIGURE = 100;
    public static final int NUMBER_OF_FIGURES = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int result = random.nextInt(NUMBER_OF_FIGURES);
        if (result == 1) {
            return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_INT_FOR_FIGURE));
        } else if (result == 2) {
            return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_INT_FOR_FIGURE));
        } else if (result == 3) {
            return new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_INT_FOR_FIGURE), random.nextInt(MAX_INT_FOR_FIGURE));
        } else if (result == 4) {
            return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_INT_FOR_FIGURE),
                    random.nextInt(MAX_INT_FOR_FIGURE));
        } else {
            return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_INT_FOR_FIGURE), random.nextInt(MAX_INT_FOR_FIGURE),
                    random.nextInt(MAX_INT_FOR_FIGURE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), DEFAULT_CIRCLE_RADIUS);
    }
}

