package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int BOUND = 100;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int number = new Random().nextInt(FIGURES_COUNT);
        if (number == 1) {
            return new Circle(colorSupplier.getRandomColor(), random.nextInt(BOUND));
        }
        if (number == 2) {
            return new Square(random.nextInt(BOUND), colorSupplier.getRandomColor());
        }
        if (number == 3) {
            return new Rectangle(colorSupplier.getRandomColor(),
                    random.nextInt(BOUND), random.nextInt(BOUND));
        }
        if (number == 4) {
            return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextInt(BOUND), random.nextInt(BOUND), random.nextInt(BOUND));
        }
        return new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextInt(BOUND), random.nextInt(BOUND));
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
