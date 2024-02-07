package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 6;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomeType = random.nextInt(FIGURE_COUNT);
        switch (randomeType) {
            case 1:
                return new Square(random.nextDouble() * 10, colorSupplier.getRandomColor());
            case 2:
                return new Circle(random.nextDouble() * 10, colorSupplier.getRandomColor());
            case 3:
                return new Rectangle(random.nextDouble() * 10, random.nextDouble() * 10,
                        colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(random.nextDouble() * 10, random.nextDouble() * 10,
                        random.nextDouble() * 10, colorSupplier.getRandomColor());
            case 5:
                return new RightTriangle(random.nextDouble() * 10, random.nextDouble() * 10,
                        colorSupplier.getRandomColor());
            default:
                return null;
        }
    }

    public Figure getDefultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
