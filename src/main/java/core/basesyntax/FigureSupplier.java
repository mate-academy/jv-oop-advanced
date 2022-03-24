package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int SIDE_VALUES = 20;
    private static final int FIGURE_NUM = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int number = random.nextInt(FIGURE_NUM);
        if (number == 1) {
            return new Circle(random.nextInt(SIDE_VALUES), colorSupplier.getRandomColor());
        } else if (number == 2) {
            return new Square(random.nextInt(SIDE_VALUES), colorSupplier.getRandomColor());
        } else if (number == 3) {
            return new RightTriangle(random.nextInt(SIDE_VALUES), random.nextInt(SIDE_VALUES),
                    colorSupplier.getRandomColor());
        } else if (number == 4) {
            return new IsoscelesTrapezoid(random.nextInt(SIDE_VALUES), random.nextInt(SIDE_VALUES),
                    random.nextInt(SIDE_VALUES), colorSupplier.getRandomColor());
        } else {
            return new Rectangle(random.nextInt(SIDE_VALUES), random.nextInt(SIDE_VALUES),
                    random.nextInt(SIDE_VALUES),
                    colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}
