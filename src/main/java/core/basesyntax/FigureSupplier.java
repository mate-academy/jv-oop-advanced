package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 100;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0:
                return new Circle(color.getRandomColor(), random.nextInt(BOUND) + 1);
            case 1:
                return new IsoscelesTrapezoid(color.getRandomColor(),
                        random.nextInt(BOUND) + 1, random.nextInt(BOUND) + 1,
                        random.nextInt(BOUND) + 1);
            case 2:
                return new Rectangle(color.getRandomColor(),
                        random.nextInt(BOUND) + 1, random.nextInt(BOUND) + 1);
            case 3:
                return new RightTriangle(color.getRandomColor(),
                        random.nextInt(BOUND) + 1, random.nextInt(BOUND) + 1);
            default:
                return new Square(color.getRandomColor(), random.nextInt(BOUND) + 1);
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
