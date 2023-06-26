package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_NUM = 10;
    private static final int NUM_OF_FIGURES = 5;
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUM_OF_FIGURES)) {
            case 0:
                return new Square(color.getRandomColor(), random.nextDouble() * MAX_NUM);
            case 1:
                return new Rectangle(color.getRandomColor(), random.nextDouble() * MAX_NUM,
                           random.nextDouble() * MAX_NUM + 1);
            case 2:
                return new Circle(color.getRandomColor(), random.nextDouble() * MAX_NUM);
            case 3:
                return new RightTriangle(color.getRandomColor(), random.nextDouble() * MAX_NUM,
                                random.nextDouble() * MAX_NUM);
            default:
                return new IsoscelesTrapezoid(color.getRandomColor(), random.nextDouble() * MAX_NUM,
                        random.nextDouble() * MAX_NUM, random.nextDouble() * MAX_NUM);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
