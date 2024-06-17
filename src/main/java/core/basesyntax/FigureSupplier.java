package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int RANGE_BOUND = 5;
    public static final int DEFAULT_RADIUS = 10;
    public static final int MAXIMUM_LENGTH = 50;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(RANGE_BOUND);
        switch (index) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), randomSize());
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), randomSize(), randomSize());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), randomSize(),
                        randomSize());
            case 3:
                return new Circle(colorSupplier.getRandomColor(), randomSize());
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomSize(), randomSize(), randomSize());
        }
    }

    private int randomSize() {
        return 1 + random.nextInt(MAXIMUM_LENGTH);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
