package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 100;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final Color DEFAULT_CIRCLE_COLOR = Color.WHITE;
    private static final int FIGURES_NUMBER = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURES_NUMBER)) {
            case 0:
                return new Square(random.nextInt(MAX_NUMBER), colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER), colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER), colorSupplier.getRandomColor());
            case 3:
                return new IsoscelesTrapezoid(random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER), colorSupplier.getRandomColor());
            case 4:
                return new Circle(random.nextInt(MAX_NUMBER), colorSupplier.getRandomColor());
            default:
                return new Circle(random.nextInt(MAX_NUMBER), colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure(int number) {
        return new Circle(DEFAULT_CIRCLE_RADIUS,DEFAULT_CIRCLE_COLOR);
    }
}
