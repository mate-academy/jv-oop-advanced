package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 9;
    private static final int DEFAULT_RADIUS = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    public Figure getRandomFigure(int randomIndex) {

        switch (randomIndex) {
            case 0:
                return new Square(random.nextInt(MIN_SIZE, MAX_SIZE),
                        new ColorSupplier().getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(random.nextInt(MIN_SIZE, MAX_SIZE),
                        random.nextInt(MIN_SIZE, MAX_SIZE), random.nextInt(MIN_SIZE, MAX_SIZE),
                        new ColorSupplier().getRandomColor());
            case 2:
                return new RightTriangle(random.nextInt(MIN_SIZE, MAX_SIZE),
                        random.nextInt(MIN_SIZE, MAX_SIZE),
                        new ColorSupplier().getRandomColor());
            case 3:
                return new Circle(random.nextInt(MIN_SIZE, MAX_SIZE),
                        new ColorSupplier().getRandomColor());
            case 4:
                return new Rectangle(random.nextInt(MIN_SIZE, MAX_SIZE),
                        random.nextInt(MIN_SIZE, MAX_SIZE),
                        new ColorSupplier().getRandomColor());
            default:
                return new Circle(DEFAULT_RADIUS, Color.WHITE.name());
        }
    }
}
