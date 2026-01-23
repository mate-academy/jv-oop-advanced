package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();
    private static final int FIGURE_COUNT = 5;
    private static final int BOUND = 10;
    private static final int NUM = 1;
    private static final int DEFAULT_RADIUS = 10;

    public Behavior getRandomFigure() {
        int type = random.nextInt(FIGURE_COUNT);

        return switch (type) {
            case 0 -> new Square(colorSupplier.getRandomColor(), random.nextInt(BOUND) + NUM);
            case 1 -> new Rectangle(colorSupplier.getRandomColor(),
                    random.nextInt(BOUND) + NUM,
                    random.nextInt(BOUND) + NUM);
            case 2 -> new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextInt(BOUND) + NUM,
                    random.nextInt(BOUND) + NUM);
            case 3 -> new Circle(colorSupplier.getRandomColor(),
                    random.nextInt(BOUND) + NUM);
            default -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    10, 6, 5);
        };
    }

    public Behavior getDefaultFigure(){
        return new Circle(Colors.WHITE.name(), DEFAULT_RADIUS);
    }
}
