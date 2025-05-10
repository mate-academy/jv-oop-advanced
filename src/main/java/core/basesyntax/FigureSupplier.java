package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIDE_VALUES = 20;
    private static final int FIGURE_NUM = 5;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int number = random.nextInt(FIGURE_NUM);
        if (number == 1) {
            return new Circle(random.nextInt(MAX_SIDE_VALUES), colorSupplier.getRandomColor());
        }
        if (number == 2) {
            return new Square(random.nextInt(MAX_SIDE_VALUES), colorSupplier.getRandomColor());
        }
        if (number == 3) {
            return new RightTriangle(random.nextInt(MAX_SIDE_VALUES),
                    random.nextInt(MAX_SIDE_VALUES),
                    colorSupplier.getRandomColor());
        }
        if (number == 4) {
            return new IsoscelesTrapezoid(random.nextInt(MAX_SIDE_VALUES),
                    random.nextInt(MAX_SIDE_VALUES),
                    random.nextInt(MAX_SIDE_VALUES),
                    colorSupplier.getRandomColor());
        }
        return new Rectangle(random.nextInt(MAX_SIDE_VALUES),
                random.nextInt(MAX_SIDE_VALUES),
                random.nextInt(MAX_SIDE_VALUES),
                colorSupplier.getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.name());
    }
}
