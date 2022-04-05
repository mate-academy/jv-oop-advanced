package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_AMOUNT = 5;
    private static final int CONSTANT_RADIUS = 10;
    private static final int MAX_RANDOM = 30;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_AMOUNT)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM),
                        random.nextInt(MAX_RANDOM),
                        random.nextInt(MAX_RANDOM));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM),
                        random.nextInt(MAX_RANDOM));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM),
                        random.nextInt(MAX_RANDOM));
            case 4:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM));
            default:
                return new FigureSupplier().getRandomFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString().toLowerCase(), CONSTANT_RADIUS);
    }
}
